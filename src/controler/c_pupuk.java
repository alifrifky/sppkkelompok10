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
import model.m_pupuk;
import view.view_inputpupuk;

/**
 *
 * @author Alif Rifky
 */
public class c_pupuk {
     private final view.view_inputpupuk viewPupuk;
     private final model.m_pupuk modelPupuk;    
    
    
        public c_pupuk(view_inputpupuk viewPupuk,m_pupuk modelPupuk) throws SQLException {
        this.modelPupuk= modelPupuk;
        this.viewPupuk =viewPupuk;
        viewPupuk.setVisible(true);
        viewPupuk.setTable(modelPupuk.getTable());
         viewPupuk.addinputListener(new InputListener());
        
}

    private  class InputListener implements ActionListener {

        public InputListener() {
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
         
                modelPupuk.inputA(Float.valueOf( viewPupuk.getInputA()));
                modelPupuk.inputB(Float.valueOf( viewPupuk.getInputB()));
                modelPupuk.inputC(Float.valueOf( viewPupuk.getInputC()));
                 viewPupuk.setTable(modelPupuk.getTable());
            } catch (SQLException ex) {
                Logger.getLogger(c_pupuk.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        }
    }
}