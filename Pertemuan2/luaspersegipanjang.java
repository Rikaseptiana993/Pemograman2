/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author HP
 */
public class luaspersegipanjang {
    MasterVariabel master = new MasterVariabel();
    
    double panjang = master.panjang;
    double lebar = master.lebar;
    double luas = panjang * lebar;
    
    public static void main(String[] args) {
        luaspersegipanjang B = new luaspersegipanjang ();
        System.out.println(B.luas);
    }
}
