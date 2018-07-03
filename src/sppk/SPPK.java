/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sppk;

import controler.c_login;
import controler.c_pupuk;
import controler.c_sppkuser;
import java.sql.SQLException;
import model.m_login;
import model.m_pupuk;
import view.view_inputpupuk;
import view.view_login;
import view.view_sppkuser;

/**
 *
 * @author Alif Rifky
 */
public class SPPK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        view_sppkuser view = new view_sppkuser();
     
//         m_pupuk a = new m_pupuk();
//         view_sppkuser b= new view_sppkuser();
//         c_sppkuser the=new c_sppkuser(b,a);
         
//       view_inputpupuk b = new view_inputpupuk();
//       c_pupuk theController = new c_pupuk(b, a);
    m_login a= new m_login();
    view_login b= new view_login();
    c_login  c= new c_login(a, b);
    }

}
