/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.HoaDonXuat715;
import java.sql.*;
import model.HangXuat715;
import model.MatHang715;
import model.NhanVien715;
import model.TKKhachHang715;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import model.ThongKe715;

/**
 *
 * @author Admin
 */
public class HoaDonXuat715Dao extends Dao {

    private final String SELECT_DS_HD = "select hd.id, hd.ngaydathang, hd.ngayxuat, hd.trangthai, hd.ghichu, sum(hx.soluong * hx.giaxuat) from hoadonxuat715 as hd\n"
            + "inner join hangxuat715 as hx on hd.id = hx.idhoadonxuat\n"
            + "where hd.idkhachhang = ? and hd.ngayxuat is not null and hd.ngayxuat >= ? and hd.ngayxuat <= ?\n"
            + "group by hd.id";
    private final String SELECT_HD_BY_ID = "select hd.id, hd.ngaydathang, hd.ngayxuat, hd.trangthai, hd.ghichu, sum(hx.soluong * hx.giaxuat), hd.idnvbh, hd.idnvgh from hoadonxuat715 as hd\n"
            + "inner join hangxuat715 as hx on hd.id = hx.idhoadonxuat\n"
            + "where hd.id = ?\n"
            + "group by hd.id";
    private final String SELECT_DS_HX = "select hx.id, hx.soluong, hx.giaxuat, mh.id, mh.ten from hoadonxuat715 as hd\n"
            + "inner join hangxuat715 as hx on hd.id = hx.idhoadonxuat\n"
            + "inner join mathang715 as mh on hx.idmathang = mh.id\n"
            + "where hd.id = ?";
    private final String SELECT_DS_NV = "select nv.idnv, tv.hoten, nv.chucvu from hoadonxuat715 as hd\n"
            + "inner join nhanvien715 as nv on hd.idnvbh = nv.idnv or hd.idnvgh = nv.idnv\n"
            + "inner join thanhvien715 as tv on tv.id = nv.idnv\n"
            + "where hd.id = ?";

    public HoaDonXuat715Dao() {
        super();
    }

    public ArrayList<HoaDonXuat715> getHDTheoIdKH(int idkh, ThongKe715 tk) {
        Connection connection = this.getConnection();
        ArrayList<HoaDonXuat715> dsHD = new ArrayList();
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_DS_HD);
            ps.setInt(1, idkh);
            ps.setDate(2, tk.getNgayBatDau());
            ps.setDate(3, tk.getNgayKetThuc());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                dsHD.add(new HoaDonXuat715(rs.getInt(1), rs.getDate(2), rs.getDate(3), rs.getString(4), rs.getString(5), rs.getInt(6)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsHD;
    }

    public HoaDonXuat715 getHDTheoId(int idhd) {
        Connection connection = this.getConnection();
        HoaDonXuat715 hd = null;
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_HD_BY_ID);
            ps.setInt(1, idhd);
            ResultSet rs = ps.executeQuery();
            rs.next();
            ArrayList<HangXuat715> dsHX = new ArrayList();
            
            PreparedStatement psHX = connection.prepareStatement(SELECT_DS_HX);
            psHX.setInt(1, idhd);
            ResultSet rsHX = psHX.executeQuery();
            while (rsHX.next()) {
                MatHang715 mh = new MatHang715(rsHX.getInt(4), rsHX.getString(5));
                dsHX.add(new HangXuat715(rsHX.getInt(1), rsHX.getInt(2), rsHX.getInt(3), mh));
            }
            PreparedStatement psNV = connection.prepareStatement(SELECT_DS_NV);
            psNV.setInt(1, idhd);
            ResultSet rsNV = psNV.executeQuery();
            NhanVien715 nvbh, nvgh;
            rsNV.next();
            nvbh = new NhanVien715(rsNV.getInt(1), rsNV.getString(2), rsNV.getString(3));
            rsNV.next();
            nvgh = new NhanVien715(rsNV.getInt(1), rsNV.getString(2), rsNV.getString(3));
            rsNV.next();
            if (nvbh.getChucVu().equals("giao hàng")) {
                NhanVien715 x = nvbh;
                nvbh = nvgh;
                nvgh = x;
            }
            hd = new HoaDonXuat715(rs.getInt(1),
                    rs.getDate(2),
                    rs.getDate(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getInt(6),
                    dsHX,
                    nvbh,
                    nvgh);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hd;
    }

}
