/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class MatHang715 {
    private int id;
    private String ten;
    private String moTa;
    private int giaNiemYet;
    private String hinhAnh;

    public MatHang715(int id, String ten, String moTa, int giaNiemYet, String hinhAnh) {
        this.id = id;
        this.ten = ten;
        this.moTa = moTa;

        this.giaNiemYet = giaNiemYet;
        this.hinhAnh = hinhAnh;
    }

    public MatHang715(int id, String ten) {
        this.id = id;
        this.ten = ten;
    }
    
    
    public MatHang715() {
    }
    
    

    public int getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public String getMoTa() {
        return moTa;
    }

 

    public int getGiaNiemYet() {
        return giaNiemYet;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

   
    public void setGiaNiemYet(int giaNiemYet) {
        this.giaNiemYet = giaNiemYet;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
    
    
}
