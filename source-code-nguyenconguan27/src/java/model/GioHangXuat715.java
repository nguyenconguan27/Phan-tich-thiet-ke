/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class GioHangXuat715 {
    private int id;
    private String trangThai;
    private KhachHang715 khachHang;
    private ArrayList<HangXuat715> hangXuat;

    public GioHangXuat715(int id, String trangThai, KhachHang715 khachHang, ArrayList<HangXuat715> hangXuat) {
        this.id = id;
        this.trangThai = trangThai;
        this.khachHang = khachHang;
        this.hangXuat = hangXuat;
    }

    public int getId() {
        return id;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public KhachHang715 getKhachHang() {
        return khachHang;
    }

    public ArrayList<HangXuat715> getHangXuat() {
        return hangXuat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public void setKhachHang(KhachHang715 khachHang) {
        this.khachHang = khachHang;
    }

    public void setHangXuat(ArrayList<HangXuat715> hangXuat) {
        this.hangXuat = hangXuat;
    }
    
}
