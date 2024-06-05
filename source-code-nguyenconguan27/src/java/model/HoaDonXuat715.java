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
public class HoaDonXuat715 {
    private int id;
    private Date ngayDatHang;
    private Date ngayXuat;
    private String trangThai;
    private String ghiChu;
    private int tongTien;
    private ArrayList<HangXuat715> hangXuat;
    private KhachHang715 khachHang;
    private NhanVien715 nvBanHang;
    private NhanVien715 nvGiaoHang;

    public HoaDonXuat715(int id, Date ngayDatHang, Date ngayXuat, String trangThai, String ghiChu, int tongTien,ArrayList<HangXuat715> hangXuat, KhachHang715 khachHang, NhanVien715 nvBanHang, NhanVien715 nvGiaoHang) {
        this.id = id;
        this.ngayDatHang = ngayDatHang;
        this.ngayXuat = ngayXuat;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
        this.tongTien = tongTien;
        this.hangXuat = hangXuat;
        this.khachHang = khachHang;
        this.nvBanHang = nvBanHang;
        this.nvGiaoHang = nvGiaoHang;
    }

    public HoaDonXuat715(int id, Date ngayDatHang, Date ngayXuat, String trangThai, String ghiChu, int tongTien) {
        this.id = id;
        this.ngayDatHang = ngayDatHang;
        this.ngayXuat = ngayXuat;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
        this.tongTien = tongTien;
    }

    public HoaDonXuat715(int id, Date ngayDatHang, Date ngayXuat, String trangThai, String ghiChu, int tongTien, ArrayList<HangXuat715> hangXuat, NhanVien715 nvBanHang, NhanVien715 nvGiaoHang) {
        this.id = id;
        this.ngayDatHang = ngayDatHang;
        this.ngayXuat = ngayXuat;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
        this.tongTien = tongTien;
        this.hangXuat = hangXuat;
        this.nvBanHang = nvBanHang;
        this.nvGiaoHang = nvGiaoHang;
    }
    

    public int getId() {
        return id;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }
    
    

    public Date getNgayDatHang() {
        return ngayDatHang;
    }

    public Date getNgayXuat() {
        return ngayXuat;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public ArrayList<HangXuat715> getHangXuat() {
        return hangXuat;
    }

    public KhachHang715 getKhachHang() {
        return khachHang;
    }

    public NhanVien715 getNvBanHang() {
        return nvBanHang;
    }

    public NhanVien715 getNvGiaoHang() {
        return nvGiaoHang;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNgayDatHang(Date ngayDatHang) {
        this.ngayDatHang = ngayDatHang;
    }

    public void setNgayXuat(Date ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public void setHangXuat(ArrayList<HangXuat715> hangXuat) {
        this.hangXuat = hangXuat;
    }

    public void setKhachHang(KhachHang715 khachHang) {
        this.khachHang = khachHang;
    }

    public void setNvBanHang(NhanVien715 nvBanHang) {
        this.nvBanHang = nvBanHang;
    }

    public void setNvGiaoHang(NhanVien715 nvGiaoHang) {
        this.nvGiaoHang = nvGiaoHang;
    }
   
}
