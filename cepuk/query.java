/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cepuk;

import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class query {
    
     private java.sql.Connection con;

    // Konstruktor untuk menginisialisasi koneksi
    public query() {
        try {
            // Pastikan JDBC driver sesuai dengan database Anda
            String url = "jdbc:mysql://localhost/sekolah"; // Ganti dengan URL database Anda
            String username = "root"; // Ganti dengan username database Anda
            String password = ""; // Ganti dengan password database Anda

            con = DriverManager.getConnection(url, username, password);
            System.out.println("WES ISO KONEK!!!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
    }
    
    public void insert(String NIK, String NAMA, String ALAMAT, String KELAMIN) {
        // Query INSERT
        String insertQuery = "INSERT INTO biodata (NIK, NAMA, ALAMAT, KELAMIN) VALUES (?, ?, ?, ?)";

        try {
            // Memastikan koneksi tidak null
            if (con != null) {
                // Membuat PreparedStatement
                PreparedStatement prst = con.prepareStatement(insertQuery);

                // Mengisi parameter pada query
                prst.setString(1, NIK); // Untuk nim (string)
                prst.setString(2, NAMA); // Untuk nama (string)
                prst.setString(3, ALAMAT); // Untuk alamat (string)
                prst.setString(4, KELAMIN); // Untuk jenis kelamin (string)

                // Menjalankan query INSERT
                int rowsInserted = prst.executeUpdate();

                // Menampilkan hasil
                if (rowsInserted > 0) {
                    System.out.println("Data berhasil dimasukkan!");
                } else {
                    System.out.println("Data gagal dimasukkan");
                }
            } else {
                System.out.println("Koneksi tidak tersedia");
            }

        } catch (SQLException e) {
            System.out.println("Terjadi kesalahan saat menginsert data: " + e.getMessage());
        }
    }
    
    public void delete(String NIK) {
    try {
        PreparedStatement pst = null;
        String sql = "DELETE FROM sekolah.biodata WHERE NIK = ?";
        pst = con.prepareStatement(sql);
        pst.setString(1, NIK);
        pst.executeUpdate();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}
    
    public void update(String NIK, String nama, String alamat, String KELAMIN) {
    try {
        PreparedStatement pst = null;
        String sql = "UPDATE sekolah.biodata SET NAMA = ?, ALAMAT = ?, KELAMIN = ? WHERE NIK = ?";
        pst = con.prepareStatement(sql);
        pst.setString(1, nama);
        pst.setString(2, alamat);
        pst.setString(3, KELAMIN);
        pst.setString(4, NIK);
        pst.executeUpdate();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}
    
    public static void main(String[] args) {
        // Membuat objek Query
        query Q = new query();
        
        // Memasukkan data
        Q.insert("2355201033", "Ardhi", "Kediri", "L");
    }
}

