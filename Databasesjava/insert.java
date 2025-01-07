/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Databasesjava;

import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class insert {

    koneksi konek = new koneksi();

    public void insert(int nim, String nama, String alamat, String jk) {
        
        try {
            
            konek.koneksi();
            Statement statement = konek.conn.createStatement();
            String sql = "insert into identitas values('" + nim + "','" + nama + "','" + alamat + "','" + jk + "');";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
