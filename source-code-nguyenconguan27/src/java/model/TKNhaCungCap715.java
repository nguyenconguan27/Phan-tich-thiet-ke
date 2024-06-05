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
public class TKNhaCungCap715 extends NhaCungCap715{
    
    private int soLanNhap;
    private int tongTienNhap;

    public TKNhaCungCap715(int soLanNhap, int tongTienNhap, int id, String ten, String diaChi) {
        super(id, ten, diaChi);
        this.soLanNhap = soLanNhap;
        this.tongTienNhap = tongTienNhap;
    }


    public int getSoLanNhap() {
        return soLanNhap;
    }

    public int getTongTienNhap() {
        return tongTienNhap;
    }

   
    public void setSoLanNhap(int soLanNhap) {
        this.soLanNhap = soLanNhap;
    }

    public void setTongTienNhap(int tongTienNhap) {
        this.tongTienNhap = tongTienNhap;
    }
    
    
}
