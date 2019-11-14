/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Database.koneksi;
import Implement.ImplementAdminLogin;
import Model.LoginAdmin;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author asus
 */
public class LoginAdmindao extends LoginAdmin implements ImplementAdminLogin {

    @Override
    public boolean masuk(String userid, String pass) {
        try {
            com.mysql.jdbc.Connection conn = (com.mysql.jdbc.Connection) koneksi.getConnection();//koneksi
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("select id_admin, password from admin where id_admin='" + userid + "' and password='" + pass + "'");
            if (result.next()) {
                if (userid.equals(result.getString("id_admin")) && pass.equals(result.getString("password"))) {
                    LoginAdmin.setUsername(username);
                    LoginAdmin.setPassword(password);
                    return true;

                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }

}
