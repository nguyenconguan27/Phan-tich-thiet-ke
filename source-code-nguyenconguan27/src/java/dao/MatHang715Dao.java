/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.MatHang715;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class MatHang715Dao extends Dao{
    private final String SELECT_BY_NAME = "select * from mathang715 "
            + "where ten like ?";
    private final String select = "select * from mathang715";
    private final String SELECT_BY_ID = "select * from mathang715 "
            + "where id = ?";
    public MatHang715Dao(){     
        super(); 
    }
    
    public ArrayList<MatHang715> getMHTheoTen(String ten) {
        Connection connection = super.getConnection();
        ArrayList dsMatHang = new ArrayList();
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_BY_NAME);
            ps.setString(1, '%' + ten + '%');
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                dsMatHang.add(new MatHang715(rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getInt(4),
                rs.getString(5)));
            }
        }
         catch(Exception e) {
             e.printStackTrace();
         }
        return dsMatHang;
    }
    
    public MatHang715 getMHTheoId(int id) {
        Connection connection = this.getConnection();
        MatHang715 mh = new MatHang715();
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_BY_ID);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                mh = new MatHang715(rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getInt(4),
                rs.getString(5));
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return mh;
    }
    
    public ArrayList<MatHang715> getall(String ten) {
        Connection connection = this.getConnection();
        ArrayList dsMatHang = new ArrayList();
        try {
            PreparedStatement ps = connection.prepareStatement(select);
           
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                dsMatHang.add(new MatHang715(rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getInt(4),
                rs.getString(5)));
            }
        }
         catch(Exception e) {
             e.printStackTrace();
         }
        return dsMatHang;
    }
    
}
