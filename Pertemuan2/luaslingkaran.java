/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author HP
 */
public class luaslingkaran {
    MasterVariabel master = new MasterVariabel ();
    
    double phi = master.phi;
    double jari2 = master.jari2;
    double luas = phi * (jari2 *jari2);
    
    public static void main(String[] args) {
        luaslingkaran A = new luaslingkaran ();
        System.out.println(A.luas);
    }
    
}
