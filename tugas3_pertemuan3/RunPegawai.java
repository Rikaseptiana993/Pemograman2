/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3_pertemuan3;

/**
 *
 * @author HP
 */
public class RunPegawai {
    public static void main(String[] args) {
        Pegawai cafe = new Pegawai();
        Manajer utama = new Manajer();
        Kasir bawah = new Kasir();
        Koki belakang = new Koki();
        Pelayan depan = new Pelayan();
        
        System.out.println("Nama : " + utama.Nama_manajer);
        System.out.println("gaji : " + utama.gaji_manajer);
        utama.tugas1();
        utama.Menampilkan();
        
        System.out.println("Nama : " + bawah.Nama_kasir);
        System.out.println("Gaji : " + bawah.gaji_kasir);
        bawah.Tugas2();
        bawah.Menampilkan();
        
        System.out.println("Nama : " + belakang.Nama_Koki);
        System.out.println("Gaji : " + belakang.gaji_Koki);
        belakang.Tugas3();
        belakang.Menampilkan();
        
        System.out.println(" Nama : " + depan.Nama_Pelayan);
        System.out.println(" Gaji : " + depan.gaji_Pelayan);
        depan.tugas4();
        depan.menampilkan();
        
        
    }
    
}
