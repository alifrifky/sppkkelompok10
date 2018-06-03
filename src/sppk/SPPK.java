/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sppk;

import controler.c_sppkuser;
import view.view_sppkuser;

/**
 *
 * @author Alif Rifky
 */
public class SPPK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        view_sppkuser view = new view_sppkuser();
//        c_sppkuser control = new c_sppkuser(view);
       c_sppkuser a = new c_sppkuser(new view_sppkuser());
    }

}
