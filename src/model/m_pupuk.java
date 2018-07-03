/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alif Rifky
 */
public class m_pupuk {

    private koneksi kon;
    public static String hitung;

    public m_pupuk() throws SQLException {
        kon = new koneksi("root", "", "sppk");
    }

    public DefaultTableModel getTable() throws SQLException {
        Object[] header = {"No", "Nama Pupuk", "Jumlah"};

        DefaultTableModel tm = new DefaultTableModel(null, header);
        String sql = "SELECT * FROM `pupuk`";
        ResultSet rs = kon.getResult(sql);

        while (rs.next()) {
            String a[] = new String[3];
            a[0] = rs.getString("id_pupuk");
            a[1] = rs.getString("nama_pupuk");
            a[2] = rs.getString("jumlah_pupuk");

            tm.addRow(a);
        }
        return tm;
    }

    public void inputA(float a) throws SQLException {
        String jumlah = "select jumlah_pupuk from pupuk WHERE id_pupuk =1";
        ResultSet rs = kon.getResult(jumlah);
        rs.next();
        float hitungkan = rs.getInt("jumlah_pupuk") + a;
        String query = "UPDATE pupuk SET jumlah_pupuk ='" + hitungkan + "' WHERE id_pupuk =1";
        kon.execute(query);
    }

    public void inputB(float b) throws SQLException {
        String jumlah = "select jumlah_pupuk from pupuk WHERE id_pupuk =2";
        ResultSet rs = kon.getResult(jumlah);
        rs.next();
        float hitungkan = rs.getInt("jumlah_pupuk") + b;
        String query = "UPDATE pupuk SET jumlah_pupuk ='" + hitungkan + "' WHERE id_pupuk =2";
        kon.execute(query);
    }

    public void inputC(float c) throws SQLException {
        String jumlah = "select jumlah_pupuk from pupuk WHERE id_pupuk =3";
        ResultSet rs = kon.getResult(jumlah);
        rs.next();
        float hitungkan = rs.getInt("jumlah_pupuk") + c;
        String query = "UPDATE pupuk SET jumlah_pupuk ='" + hitungkan + "' WHERE id_pupuk =3";
        kon.execute(query);

    }

    public void digunakanA(float a) throws SQLException {
        String jumlah = "select jumlah_pupuk from pupuk WHERE id_pupuk =1";
        ResultSet rs = kon.getResult(jumlah);
        rs.next();
        float hitungkan = rs.getInt("jumlah_pupuk") -(a*2/5);
        String query = "UPDATE pupuk SET jumlah_pupuk ='" + hitungkan + "' WHERE id_pupuk =1";
        kon.execute(query);
        System.out.println(hitungkan);
        System.out.println(query);
    }

    public void digunakanB(float a) throws SQLException {
        String jumlah = "select jumlah_pupuk from pupuk WHERE id_pupuk =2";
        ResultSet rs = kon.getResult(jumlah);
        rs.next();
        float hitungkan = rs.getInt("jumlah_pupuk") -(a*2/5);
        String query = "UPDATE pupuk SET jumlah_pupuk ='" + hitungkan + "' WHERE id_pupuk =2";
        kon.execute(query);
        System.out.println(query);
    }

    public void digunakanC(float a) throws SQLException {
        String jumlah = "select jumlah_pupuk from pupuk WHERE id_pupuk =3";
        ResultSet rs = kon.getResult(jumlah);
        rs.next();
        float hitungkan = rs.getInt("jumlah_pupuk") -(a*1/5);
        String query = "UPDATE pupuk SET jumlah_pupuk ='" + hitungkan + "' WHERE id_pupuk =3";
        kon.execute(query);
    }
}
