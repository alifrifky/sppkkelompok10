/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import fuzzy.tsukamoto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.view_sppkuser;

/**
 *
 * @author Alif Rifky
 */
public class c_sppkuser {

    view_sppkuser viewSppkuser;
    tsukamoto fTsukamoto;
    double C1, C2, C3;

    public c_sppkuser(view_sppkuser viewSppkuser) {
        this.viewSppkuser = viewSppkuser;
        viewSppkuser.setVisible(true);
        viewSppkuser.btn_hasil(new hasilListener());

    }

    private class hasilListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            String hasil;
            C1 = Double.parseDouble(viewSppkuser.getInput_luaslahan());
            System.out.println(C1);
            C2 = Double.parseDouble(viewSppkuser.getInput_usia());
            System.out.println(C2);
//            C3 = Integer.parseInt(String.valueOf(viewSppkuser.getkondisi1().getSelectedIndex()));



System.out.println(C3);
            tsukamoto p = new tsukamoto(C1, C2, C3);
            hasil = p.proses();
            viewSppkuser.setHasil(hasil);
            System.out.println(hasil);
        }

    }

}
