/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author asus
 */
public class LoginAdmin {
    public static String username;
    public static String password;
    
//    public LoginAdmin(){
//        
//    }

    protected static String getUsername() {
        return username;
    }

    protected static void setUsername(String username) {
        LoginAdmin.username = username;
    }

    protected static String getPassword() {
        return password;
    }

    protected static void setPassword(String password) {
        LoginAdmin.password = password;
    }
}
