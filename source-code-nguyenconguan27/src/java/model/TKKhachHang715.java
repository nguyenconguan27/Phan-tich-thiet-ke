/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class TKKhachHang715 extends KhachHang715{
    
    private int tongTienMua;
    private int soLanMua;

    public TKKhachHang715(int tongTienMua, int soLanMua, int id, String hoTen, Date ngaySinh, String sdt, String email, String diaChi, String tenDangNhap, String matKhau) {
        super(id, hoTen, ngaySinh, sdt, email, diaChi, tenDangNhap, matKhau);
        this.tongTienMua = tongTienMua;
        this.soLanMua = soLanMua;
    }

    public TKKhachHang715(int id, String hoTen, Date ngaySinh, String sdt, String email, String diaChi, String tenDangNhap, String matKhau) {
        super(id, hoTen, ngaySinh, sdt, email, diaChi, tenDangNhap, matKhau);
    }

    public TKKhachHang715() {
        super();
    }
   
    public int getTongTienMua() {
        return tongTienMua;
    }

    public int getSoLanMua() {
        return soLanMua;
    }

    public void setTongTienMua(int tongTienMua) {
        this.tongTienMua = tongTienMua;
    }

    public void setSoLanMua(int soLanMua) {
        this.soLanMua = soLanMua;
    }
    
    
    
}
