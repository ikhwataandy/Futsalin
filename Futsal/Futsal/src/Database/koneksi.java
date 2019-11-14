package Database;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author asus
 */
public class koneksi {

    private static Connection conn;

    public static void main(String[] args) throws SQLException {
        getConnection();
    }

    public static Connection getConnection() throws SQLException {
        if (conn == null) {
            try {
                String DB = "jdbc:mysql://localhost:3306/futsal"; //database futsal
                String user = "root"; // user database
                String pass = ""; // password database
                conn = (Connection) DriverManager.getConnection(DB, user, pass);
//                JOptionPane.showMessageDialog(null, "Berhasil Koneksi");
            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, "Gagal Koneksi");
            }
        }

        return conn;
    }
}
