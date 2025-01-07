/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Databasesjava;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class update {
    koneksi konek = new koneksi();

    public void update(int nim, String nama, String alamat, String jenis) {
        
        try {
            
            konek.koneksi();
            Statement statement = (Statement) konek.conn.createStatement();
             String sql_alamat = "update mahasiswa set alamat='"+ alamat +"'where nim ='"+ nim +"'";
             String sql_nama = "update mahasiswa set nama='"+ nama +"'where nim ='"+ nim +"'";
             String sql_jenis = "update mahasiswa set jeniskelamin='"+ jenis +"'where nim ='"+ nim +"'";
             
//            String sql_nim = "update identtitas set nim ='" + nim + "' where nim = '" + nim + "'";
//            String sql = "update identitas setnim ='" + nim + "','" + nama + "','" + alamat + "','" + jk + "');";
            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_jenis);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
