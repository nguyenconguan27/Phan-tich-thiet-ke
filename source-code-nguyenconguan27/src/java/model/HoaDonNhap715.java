/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class HoaDonNhap715 {
    private int id;
    private Date ngayNhap;
    private String ghiChu;
    private ArrayList<HangNhap715> hangNhap;
    private NhanVien715 nvQuanLy;
    private NhaCungCap715 nhaCungCap;

    public HoaDonNhap715(int id, Date ngayNhap, String ghiChu, ArrayList<HangNhap715> hangNhap, NhanVien715 nvQuanLy, NhaCungCap715 nhaCungCap) {
        this.id = id;
        this.ngayNhap = ngayNhap;
        this.ghiChu = ghiChu;
        this.hangNhap = hangNhap;
        this.nvQuanLy = nvQuanLy;
        this.nhaCungCap = nhaCungCap;
    }

    public int getId() {
        return id;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public ArrayList<HangNhap715> getHangNhap() {
        return hangNhap;
    }

    public NhanVien715 getNvQuanLy() {
        return nvQuanLy;
    }

    public NhaCungCap715 getNhaCungCap() {
        return nhaCungCap;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public void setHangNhap(ArrayList<HangNhap715> hangNhap) {
        this.hangNhap = hangNhap;
    }

    public void setNvQuanLy(NhanVien715 nvQuanLy) {
        this.nvQuanLy = nvQuanLy;
    }

    public void setNhaCungCap(NhaCungCap715 nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }
    
    
}
