/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Kaneki
 */
public class koneksi {
    static Connection conn;
    public static Connection getConnection(){
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/db_anime","root","");
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal");
        }
        return conn;
    }
}
