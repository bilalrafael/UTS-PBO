/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.pbo;
import java.sql.*;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class daosambung {
    private static final String URL = "jdbc:mysql://localhost:3306/utspbo?useSSL=false&serverTimezone=UTC&characterEncoding=UTF-8";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver tidak ditemukan!", e);
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
