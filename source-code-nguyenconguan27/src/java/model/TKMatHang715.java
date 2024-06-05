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
public class TKMatHang715 extends MatHang715 {
    private int tongDoanhThu;
    private int soLuongXuat;
    private int soLuongNhap;

    public TKMatHang715(int tongDoanhThu, int soLuongXuat, int soLuongNhap) {
        this.tongDoanhThu = tongDoanhThu;
        this.soLuongXuat = soLuongXuat;
        this.soLuongNhap = soLuongNhap;
    }
    

    public int getTongDoanhThu() {
        return tongDoanhThu;
    }

    public int getSoLuongXuat() {
        return soLuongXuat;
    }

    public int getSoLuongNhap() {
        return soLuongNhap;
    }


    public void setTongDoanhThu(int tongDoanhThu) {
        this.tongDoanhThu = tongDoanhThu;
    }

    public void setSoLuongXuat(int soLuongXuat) {
        this.soLuongXuat = soLuongXuat;
    }

    public void setSoLuongNhap(int soLuongNhap) {
        this.soLuongNhap = soLuongNhap;
    }
    
    
}
