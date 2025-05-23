/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADVAN
 */
public class Lingkaran {

    public static final double PI = 3.141592;

    public void hitungLuas(double r) {
        double luas = PI * r * r;
        
        System.out.println("Luas Lingkaran (r = " + r + "):");
        System.out.println("  Bentuk Pecahan  : " + luas);
        System.out.println("  Bentuk Bulat    : " + (int) luas);
        System.out.println("  Pembulatan      : " + Math.round(luas));
    }
}