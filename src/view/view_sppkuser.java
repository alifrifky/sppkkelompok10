/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Alif Rifky
 */
public class view_sppkuser extends javax.swing.JFrame {

    /**
     * Creates new form test
     */
    public view_sppkuser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kondisi = new javax.swing.JComboBox<>();
        btn_panel = new javax.swing.JButton();
        input_luaslahan = new javax.swing.JTextField();
        input_usia = new javax.swing.JTextField();
        btn_gunakan = new javax.swing.JButton();
        input_kondisi = new javax.swing.JTextField();
        btn_jawaban = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        hasil = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kondisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tidak Parah", "Sedang", "Parah" }));
        kondisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kondisiActionPerformed(evt);
            }
        });
        getContentPane().add(kondisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 773, 93, -1));

        btn_panel.setText("PANEL");
        getContentPane().add(btn_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 960, -1, -1));

        input_luaslahan.setAutoscrolls(false);
        input_luaslahan.setBorder(null);
        input_luaslahan.setDoubleBuffered(true);
        input_luaslahan.setOpaque(false);
        getContentPane().add(input_luaslahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 310, 40));

        input_usia.setBorder(null);
        input_usia.setOpaque(false);
        input_usia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_usiaActionPerformed(evt);
            }
        });
        getContentPane().add(input_usia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 310, 40));

        btn_gunakan.setText("Gunakan");
        getContentPane().add(btn_gunakan, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, -1, -1));

        input_kondisi.setBorder(null);
        input_kondisi.setOpaque(false);
        getContentPane().add(input_kondisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 310, 40));

        btn_jawaban.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/btn_masukkan.png"))); // NOI18N
        btn_jawaban.setBorderPainted(false);
        btn_jawaban.setContentAreaFilled(false);
        getContentPane().add(btn_jawaban, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 160, -1));

        hasil.setColumns(20);
        hasil.setRows(5);
        hasil.setBorder(null);
        hasil.setOpaque(false);
        jScrollPane2.setViewportView(hasil);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, 450, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_usiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_usiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_usiaActionPerformed

    private void kondisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kondisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kondisiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(view_sppkuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_sppkuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_sppkuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_sppkuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_sppkuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_gunakan;
    private javax.swing.JToggleButton btn_jawaban;
    private javax.swing.JButton btn_panel;
    private javax.swing.JTextArea hasil;
    private javax.swing.JTextField input_kondisi;
    private javax.swing.JTextField input_luaslahan;
    private javax.swing.JTextField input_usia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> kondisi;
    // End of variables declaration//GEN-END:variables

    public void btn_hasil(ActionListener a) {
        this.btn_jawaban.addActionListener(a);
    }

    public void btn_gunakan(ActionListener a) {
        this.btn_gunakan.addActionListener(a);
    }

    public String getInput_usia() {
        return input_usia.getText();
    }
     public String getkondisi() {
        return input_kondisi.getText();
    }

    public String getInput_luaslahan() {
        return input_luaslahan.getText();
    }

   
     public void setHasil(String hasil) {
        this.hasil.setText(hasil);
    }
     public String getHasil() {
        return hasil.getText();
    }

   
  
    

    public JComboBox<String> getkondisi1() {
        return kondisi;
    }}


