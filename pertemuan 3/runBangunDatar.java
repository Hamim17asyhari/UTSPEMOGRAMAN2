/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author mmccom
 */
public class runBangunDatar {
    
    public static void main(String[] args) {
       
        masterBangunDatar T = new masterBangunDatar();
        // Prosedur
        T.HitungLuasJajarGenjang(4, 10);
        T.HitungKelilingJajarGenjang(4, 6);
        // Fungsi
        System.out.println("Luas Jajar Genjang = " + T.hitungLuasJajarGenjang1(6, 8));
        System.out.println("Keliling Jajar Genjang = " + T.hitungKelilingJajarGenjang1(7, 8));
        // static Prosedur
        masterBangunDatar.HitungLuasJajarGenjang2(7, 4);
        masterBangunDatar.HitungKelilingJajarGenjang2(7, 4);
        // static Prosedur
        System.out.println("Luas Jajar Genjang = " + masterBangunDatar.hitungLuasJajarGenjang3(5, 7));
        System.out.println("Keliling Jajar Genjang = " + masterBangunDatar.hitungKelilingJajarGenjang3(5, 7));
    }

   
}
