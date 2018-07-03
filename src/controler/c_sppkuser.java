/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import fuzzy.tsukamoto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.m_pupuk;
import view.view_sppkuser;

/**
 *
 * @author Alif Rifky
 */
public class c_sppkuser {

    view_sppkuser viewSppkuser;
    tsukamoto fTsukamoto;
    double C1, C2, C3;
    private final model.m_pupuk modelPupuk;

    public c_sppkuser(view_sppkuser viewSppkuser, m_pupuk modelPupuk) {
        this.modelPupuk = modelPupuk;
        this.viewSppkuser = viewSppkuser;
        viewSppkuser.setVisible(true);
        viewSppkuser.btn_hasil(new hasilListener());
        viewSppkuser.btn_gunakan(new gunakanListener());

    }

    private class hasilListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            Double hasil;
            C1 = Double.parseDouble(viewSppkuser.getInput_luaslahan());
            System.out.println(C1);
            C2 = Double.parseDouble(viewSppkuser.getInput_usia());
            System.out.println(C2);
            C3 = Double.parseDouble(viewSppkuser.getkondisi());
            System.out.println(C2);
            System.out.println(C3);
            tsukamoto p = new tsukamoto(C1, C2, C3);
            hasil = p.proses();
            viewSppkuser.setHasil(Double.toString(hasil));
            System.out.println(hasil);
        }

    }

    private class gunakanListener implements ActionListener {

        public gunakanListener() {
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                modelPupuk.digunakanA(Float.valueOf(viewSppkuser.getHasil()));
                modelPupuk.digunakanB(Float.valueOf(viewSppkuser.getHasil()));
                modelPupuk.digunakanC(Float.valueOf(viewSppkuser.getHasil()));
            } catch (SQLException ex) {
                Logger.getLogger(c_sppkuser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
