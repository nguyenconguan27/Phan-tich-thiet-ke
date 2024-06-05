/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Admin
 */
public abstract class Dao {
    private String DB_URL = "jdbc:mysql://localhost:3306/shopman";
    private String username = "root";
    private String password = "1234567";
    private Connection connection = null;
    
    public Connection getConnection() {
        return this.connection;
    }

    public Dao(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection(DB_URL, username, password);
            System.out.println("connect successfully");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
   
}
