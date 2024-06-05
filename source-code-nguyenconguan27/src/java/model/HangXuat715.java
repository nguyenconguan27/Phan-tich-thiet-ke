/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class HangXuat715 {
    private int id;
    private int soLuong;
    private int giaXuat;
    private MatHang715 matHang;

    public HangXuat715(int id, int soLuong, int giaXuat, MatHang715 matHang) {
        this.id = id;
        this.soLuong = soLuong;
        this.giaXuat = giaXuat;
        this.matHang = matHang;
    }

    public HangXuat715() {
    }

    
    public int getId() {
        return id;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public int getGiaXuat() {
        return giaXuat;
    }

    public MatHang715 getMatHang() {
        return matHang;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setGiaXuat(int giaXuat) {
        this.giaXuat = giaXuat;
    }

    public void setMatHang(MatHang715 matHang) {
        this.matHang = matHang;
    }
    
    
}
