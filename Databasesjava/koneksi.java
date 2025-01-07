/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Databasesjava;
// import bumbu-bumbu yang diperlukan

import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;

// bisa juga diimpor sekaligus seperti ini:
// import java.sql.*
public class koneksi {

    public static void main(String[] args) {
        koneksi teskoneksi = new koneksi();
        teskoneksi.koneksi();

    }

    Connection conn = null;
    
    String statuskoneksi;

    public void koneksi() {
        try {
            String connectionURL = "jdbc:mysql://localhost/mahasiswa";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(connectionURL, username, password);
//            JOptionPane.showMessageDialog(null, "sukses koneksi");
            statuskoneksi = "Berhasil";
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
            statuskoneksi = "Gagal";
//            System.exit(0);
        }
    }
}
