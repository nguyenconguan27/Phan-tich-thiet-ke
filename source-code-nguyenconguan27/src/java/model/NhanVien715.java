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
public class NhanVien715 extends ThanhVien715 {
    
    private String chucVu;
    
    public NhanVien715(int id, String hoTen, Date ngaySinh, String sdt, String email, String diaChi, String tenDangNhap, String matKhau, String chucVu) {
        super(id, hoTen, ngaySinh, sdt, email, diaChi, tenDangNhap, matKhau);
        this.chucVu = chucVu;
    }

    public NhanVien715(int id, String hoTen, String chucVu) {
        super(id, hoTen);
        this.chucVu = chucVu;
    }

    
    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    
}
