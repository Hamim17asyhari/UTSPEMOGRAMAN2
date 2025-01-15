/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author mmccom
 */
public class masterBangunDatar {
    // Prosedur
     void HitungLuasJajarGenjang(int a, int t){
        int luas = a * t;
        System.out.println("Alas = " + a);
        System.out.println("Tinggi = " + t);
        System.out.println("Luas Jajar Genjang = " + luas);
    }
    // Prosedur 
     void HitungKelilingJajarGenjang(int a, int b){
        int keliling = 2 * (a+b);
        System.out.println("Sisi A = " + a);
        System.out.println("Sisi B = " + b);
        System.out.println("Keliling Jajar Genjang = " + keliling);
    }
    // Fungsi 
     int hitungLuasJajarGenjang1(int a, int t){
        int luas = a* t;
        System.out.println("Alas = " + a);
        System.out.println("Tinggi = " + t);
        return luas;
        
    }
    // Fungsi 
     int hitungKelilingJajarGenjang1(int a, int b){
        int keliling = 2 * (a+b);
        System.out.println("Sisi A = " + a);
        System.out.println("Sisi B = " + b);
        return keliling;
    }
    // static Prosedur 
     static void HitungLuasJajarGenjang2(int a, int t){
        int luas = a * t;
        System.out.println("Alas = " + a);
        System.out.println("Tinggi = " + t);
        System.out.println("Luas Jajar Genjang = " + luas);
    }
    // static Prosedur 
     static void HitungKelilingJajarGenjang2(int a, int b){
        int keliling = 2 * (a+b);
        System.out.println("Sisi A = " + a);
        System.out.println("Sisi B = " + b);
        System.out.println("Keliling Jajar Genjang = " + keliling);
    }
    // static Fungsi 
     static int hitungKelilingJajarGenjang3(int a, int b){
        int keliling = 2 * (a+b);
        System.out.println("Sisi A = " + a);
        System.out.println("Sisi B = " + b);
        return keliling;
    }
    // static Fungsi
     static  int hitungLuasJajarGenjang3(int a, int t){
        int luas = a* t;
        System.out.println("Alas = " + a);
        System.out.println("Tinggi = " + t);
        return luas;
        
    }
}
