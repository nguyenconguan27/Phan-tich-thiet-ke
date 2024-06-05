/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.TKKhachHang715;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import model.ThongKe715;

/**
 *
 * @author Admin
 */
public class TKKhachHang715Dao extends Dao {

    private final String SELECT_DS_KH = "select tv.id, tv.hoten, tv.ngaysinh, tv.sdt, tv.email, tv.diachi,  sum(hx.soluong * hx.giaxuat) from khachhang715 as kh\n"
            + "inner join thanhvien715 as tv on tv.id = kh.idkh\n"
            + "inner join hoadonxuat715 as hd on kh.idkh = hd.idkhachhang\n"
            + "inner join hangxuat715 as hx on hx.idhoadonxuat = hd.id\n"
            + "where hd.ngayxuat is not null and hd.ngayxuat >= ? and hd.ngayxuat <= ?\n"
            + "group by kh.idkh";
    private final String SELECT_SO_HD = "select kh.idkh, count(hd.id) from hoadonxuat715 as hd\n"
            + "inner join khachhang715 as kh on kh.idkh = hd.idkhachhang\n"
            + "where kh.idkh = ? and hd.ngayxuat is not null and hd.ngayxuat >= ? and hd.ngayxuat <= ?\n"
            + "group by kh.idkh";
    private final String SELECT_CT_KH = "select tv.id, tv.hoten, tv.ngaysinh, tv.sdt, tv.email, tv.diachi, sum(hx.soluong * hx.giaxuat) from khachhang715 as kh\n"
            + "inner join thanhvien715 as tv on tv.id = kh.idkh\n"
            + "inner join hoadonxuat715 as hd on kh.idkh = hd.idkhachhang\n"
            + "inner join hangxuat715 as hx on hx.idhoadonxuat = hd.id\n"
            + "where hd.ngayxuat is not null and hd.ngayxuat >= ? and hd.ngayxuat <= ? and kh.idkh = ?\n"
            + "group by kh.idkh";

    public TKKhachHang715Dao() {
        super();
    }

    public ArrayList<TKKhachHang715> getDanhSachTKKH(ThongKe715 tk) {
        Connection connection = this.getConnection();
        ArrayList<TKKhachHang715> dsTKKH = new ArrayList();
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_DS_KH);
            ps.setDate(1, tk.getNgayBatDau());
            ps.setDate(2, tk.getNgayKetThuc());
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                TKKhachHang715 tkkh = new TKKhachHang715();
                tkkh.setId(rs.getInt(1));
                tkkh.setHoTen(rs.getString(2));
                tkkh.setNgaySinh(rs.getDate(3));
                tkkh.setSdt(rs.getString(4));
                tkkh.setEmail(rs.getString(5));
                tkkh.setDiaChi(rs.getString(6));
                tkkh.setTongTienMua(rs.getInt(7));
                PreparedStatement psSoHD = connection.prepareStatement(SELECT_SO_HD);
                psSoHD.setInt(1, tkkh.getId());
                psSoHD.setDate(2, tk.getNgayBatDau());
                psSoHD.setDate(3, tk.getNgayKetThuc());
                ResultSet rsSoHD = psSoHD.executeQuery();
                rsSoHD.next();
                tkkh.setSoLanMua(rsSoHD.getInt(2));
                dsTKKH.add(tkkh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dsTKKH;
    }
    
    public TKKhachHang715 getChiTietTKKH(ThongKe715 tk, int idkh) {
        Connection connection = this.getConnection();
        TKKhachHang715 tkkh = new TKKhachHang715();
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_CT_KH);
            ps.setDate(1, tk.getNgayBatDau());
            ps.setDate(2, tk.getNgayKetThuc());
            ps.setInt(3, idkh);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                tkkh.setId(rs.getInt(1));
                tkkh.setHoTen(rs.getString(2));
                tkkh.setNgaySinh(rs.getDate(3));
                tkkh.setSdt(rs.getString(4));
                tkkh.setEmail(rs.getString(5));
                tkkh.setDiaChi(rs.getString(6));
                tkkh.setTongTienMua(rs.getInt(7));
                PreparedStatement psSoHD = connection.prepareStatement(SELECT_SO_HD);
                psSoHD.setInt(1, tkkh.getId());
                ResultSet rsSoHD = psSoHD.executeQuery();
                rsSoHD.next();
                tkkh.setSoLanMua(rsSoHD.getInt(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return tkkh;
    }
}
