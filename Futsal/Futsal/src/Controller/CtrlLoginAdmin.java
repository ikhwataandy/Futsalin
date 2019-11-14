/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.LoginAdmindao;
import Implement.ImplementAdminLogin;
import Model.LoginAdmin;
import View.AdminLogin;
import View.SewaView;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class CtrlLoginAdmin extends LoginAdmin{
    private static AdminLogin viewLogin;
    private static ImplementAdminLogin implemenAdminLogin;
    
    public CtrlLoginAdmin(AdminLogin viewLogin){
        this.viewLogin = viewLogin;
        implemenAdminLogin = new LoginAdmindao();
      
    }
    
    public void masuk(){
        if (implemenAdminLogin.masuk(viewLogin.getUsername().getText(), viewLogin.getPassword().getText())) {
            JOptionPane.showMessageDialog(null, "Login Sukses");
            new SewaView().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Login gagal");
        }
    }
    
                            
}
