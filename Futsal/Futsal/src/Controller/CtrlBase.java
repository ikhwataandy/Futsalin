/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class CtrlBase {
    public static void Sukses(String a){
        JOptionPane.showMessageDialog(null, a, "Pesan", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void gagal(String a){
        JOptionPane.showMessageDialog(null, a, "Pesan", JOptionPane.ERROR_MESSAGE);
    }
    
}
