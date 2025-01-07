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
public class delete {
    koneksi konek = new koneksi();

    public void delete(int nim) {
        
        try {
            
            konek.koneksi();
            Statement statement = (Statement) konek.conn.createStatement();
            String sql = "delete from identitas where nim '" + nim + "'";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
