/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1_pertemuan2;

/**
 *
 * @author HP
 */
public class KRS {
    public static void main(String[] args) {
        MasterMatkul aa = new MasterMatkul ();
        MasterDosen bb = new MasterDosen ();
        MasterMahasiswa cc = new MasterMahasiswa ();
        
        System.out.println("----------SIM UNU BLITAR-----------");
        System.out.println("Nama Mahasiswa = " + cc.nama);
        System.out.println("NIM = " + cc.nim);
        System.out.println("Jenis Kelamin = " + cc.jeniskelamin);
        System.out.println("Nama Dosen Wali = " + bb.DosenWali);
        System.out.println("Nama Dosen Pengampu = " + bb.Dosenpengampu);
        System.out.println("Nama Matkul = " + aa.namaMatkul);
        
    }
}
