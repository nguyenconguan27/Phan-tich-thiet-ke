/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Date;
import model.HoaDonXuat715;
import model.KhachHang715;
import model.NhanVien715;
import model.ThanhVien715;

/**
 *
 * @author Admin
 */
public class ThanhVien715Dao extends Dao {

    private final String SELECT_TV = "select * from thanhvien715 as tv\n"
            + "left join nhanvien715 as nv on nv.idnv = tv.id\n"
            + "left join khachhang715 as kh on kh.idkh = tv.id\n"
            + "where tv.tendangnhap = ? and tv.matkhau = ?";

    public ThanhVien715Dao() {
        super();
    }

    public ThanhVien715 dangNhap(String user, String pass) {
        Connection connection = this.getConnection();
        ArrayList<HoaDonXuat715> dsHD = new ArrayList();
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_TV);
            ps.setString(1, user);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            rs.next();
            int id = rs.getInt(1);
            String ten = rs.getString(2);
            Date ngaysinh = rs.getDate(3);
            String sdt = rs.getString(4);
            String email = rs.getString(5);
            String diachi = rs.getString(6);
            Integer idnv = rs.getInt(9);
            String chucvu = rs.getString(10);
            Integer idkh = rs.getInt(11);
            if(chucvu != null) {
                return new NhanVien715(id, ten, ngaysinh, sdt, email, diachi, user, pass, chucvu);
            }
            else {
                return new KhachHang715(id, ten, ngaysinh, sdt, email, diachi, user, pass);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
