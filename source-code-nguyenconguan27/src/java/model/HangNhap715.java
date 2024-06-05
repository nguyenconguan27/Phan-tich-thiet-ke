/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class HangNhap715 {
    private int id;
    private int soLuong;
    private int giaNhap;
    private MatHang715 matHang;

    public HangNhap715(int id, int soLuong, int giaNhap, MatHang715 matHang) {
        this.id = id;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.matHang = matHang;
    }

    public int getId() {
        return id;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public int getGiaNhap() {
        return giaNhap;
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

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

    public void setMatHang(MatHang715 matHang) {
        this.matHang = matHang;
    }
    
}
