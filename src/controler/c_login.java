/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.binding.Bindings;
import javax.swing.JOptionPane;
import model.m_login;
//import view.v_beranda;
import view.view_login;

/**
 *
 * @author Alif
 */
public class c_login {

    public String username;
    m_login theModel;
    view_login theView;

    public static String id;

    public c_login(m_login theModel, view_login theView) {
        this.theModel = theModel;
        this.theView = theView;
        theView.setVisible(true);
        theView.addLoginListener(new loginListener());

    }

    private class loginListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                theModel.cekLogin(theView.getTulis_username(), theView.getTulis_password());
                id = m_login.id_user;
                username = theView.getTulis_username();
           
                if (theModel.getStatus().equals("1")) {
                    theView.dispose();
                    c_sppkuser a = new c_sppkuser(new view.view_sppkuser(), new model.m_pupuk());
                   
                } else if (theModel.getStatus().equals("2")) {
                    theView.dispose();
                    c_pupuk m = new c_pupuk(new view.view_inputpupuk(), new model.m_pupuk());
                } else if (theView.getTulis_username().isEmpty() && theView.getTulis_password().isEmpty()) {
                    JOptionPane.showMessageDialog(theView, "  username dan password tidak boleh kosong");
                } else if (theView.getTulis_password().isEmpty()) {
                    JOptionPane.showMessageDialog(theView, "masukkan password dahulu");
                } else if (theView.getTulis_username().isEmpty()) {
                    JOptionPane.showMessageDialog(theView, "masukkan  username dahulu");

                } else {
                    JOptionPane.showMessageDialog(theView, "username dan password salah");
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void Setusername(String username) {
        this.username = username;
    }

    public String getusername() {
        return username;
    }
}
