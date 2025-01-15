/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cepuk;

/**
 *
 * @author ASUS
 */

import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class conek {

    public static void main(String[] args) {

        conek tk = new conek();
        tk.koneksi();
    }

    Connection con = null;

    String statusKoneksi;

    public void koneksi() {
        try {
            String connectionURL = "jdbc:mysql://localhost/sekolah";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(connectionURL, username, password);
            //JOptionPane.showMessageDialog(null, "Sukses Koneksi");
            statusKoneksi = "Berhasil";
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "Koneksi gagal: " + e.getMessage());
            statusKoneksi = "Gagal";
        }
    }
}

/*try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sekolah", "root", "");

            return cn;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "gagal" + e);
        return null;
        }
       
    }

  
    void konek(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sekolah","root","");
            JOptionPane.showMessageDialog(null, "sukses");
          statuskoneksi = "sukses";
          
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "gagal" +e);
             statuskoneksi = "ra konek";
            System.exit(0);
    }
}   */
