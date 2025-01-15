/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cepuk;

import com.mysql.cj.xdevapi.Statement;
import java.sql.*;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ASUS
 */
public class biodata extends javax.swing.JFrame {

    /**
     * Creates new form biodata
     */
    public biodata() {
        initComponents();

        this.setTitle(" web site biodata");
        this.setLocationRelativeTo(this);

        conek c = new conek();
        c.koneksi();
        stu.setText(c.statusKoneksi);
        ButtonGroup bg = new ButtonGroup();
        bg.add(laki);
        bg.add(perempuan);

        table();
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tnik = new javax.swing.JTextField();
        tnama = new javax.swing.JTextField();
        talamat = new javax.swing.JTextField();
        tmhapus = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        laki = new javax.swing.JRadioButton();
        perempuan = new javax.swing.JRadioButton();
        tmsimpan = new javax.swing.JButton();
        tmupdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        STATUS = new javax.swing.JLabel();
        stu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("NIK");

        jLabel3.setText("NAMA");

        jLabel4.setText("ALAMAT");

        tmhapus.setText("HAPUS");
        tmhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmhapusActionPerformed(evt);
            }
        });

        jLabel6.setText("KELAMIN");

        laki.setText("LAKI");
        laki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lakiActionPerformed(evt);
            }
        });

        perempuan.setText("PEREMPUAN");

        tmsimpan.setText("SIMPAN");
        tmsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmsimpanActionPerformed(evt);
            }
        });

        tmupdate.setText("UPDATE");
        tmupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmupdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(tmsimpan))))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(talamat, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(tnama)
                            .addComponent(tnik))
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(tmhapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tmupdate))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(laki)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                                .addComponent(perempuan)))
                        .addGap(36, 36, 36))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(talamat, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(laki)
                    .addComponent(perempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tmhapus, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tmsimpan, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tmupdate, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );

        jLabel1.setText("BIODATA PENDUDUK DENGAN NIK");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        STATUS.setText("STATUS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(stu)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(STATUS)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(STATUS)
                .addGap(18, 18, 18)
                .addComponent(stu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIK", "NAMA", "ALAMAT", "KELAMIN"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 java.sql.Statement pst;
    ResultSet rs;

    public void table() {
        conek c = new conek();
        c.koneksi();
        try {
            String sql = "select * from sekolah.biodata";
            pst = c.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void lakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lakiActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked

    private void tmsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmsimpanActionPerformed
        // TODO add your handling code here:
        query que = new query();
        String NIK = tnik.getText();
        String NAMA = tnama.getText();
        String ALAMAT = talamat.getText();
        String KELAMIN = "";

        if (laki.isSelected()) {
            KELAMIN = "L";
        } else if (perempuan.isSelected()) {
            KELAMIN = "P";

        }
        que.insert(NIK, NAMA, ALAMAT, KELAMIN);
        JOptionPane.showMessageDialog(this, "Data berhasil disimpan!", "Success", JOptionPane.INFORMATION_MESSAGE);
        table();
    }//GEN-LAST:event_tmsimpanActionPerformed
    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {
        // Ambil baris yang dipilih pada tabel
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            tnik.setText(table.getValueAt(selectedRow, 0).toString());
            tnama.setText(table.getValueAt(selectedRow, 1).toString());
            talamat.setText(table.getValueAt(selectedRow, 2).toString());

            String KELAMIN = table.getValueAt(selectedRow, 3).toString();
            if (KELAMIN.equals("L")) {
                laki.setSelected(true);
            } else if (KELAMIN.equals("P")) {
                perempuan.setSelected(true);
            }
        }
    }
    private void tmhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmhapusActionPerformed
        // TODO add your handling code here:
        String NIK = tnik.getText();

        if (NIK.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan NIK untuk menghapus data!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        query que = new query();
        int response = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?",
                "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            que.delete(NIK);
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus!", "Success", JOptionPane.INFORMATION_MESSAGE);
            table(); // Refresh tabel setelah penghapusan
        }
    }//GEN-LAST:event_tmhapusActionPerformed
    query q = new query();
    private void tmupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmupdateActionPerformed
        // TODO add your handling code here:
        String NIK = tnik.getText();
        String NAMA = tnama.getText();
        String ALAMAT = talamat.getText();
        String KELAMIN = laki.isSelected() ? "L" : perempuan.isSelected() ? "P" : "";

        if (NIK.isEmpty() || NAMA.isEmpty() || ALAMAT.isEmpty() || KELAMIN.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Harap lengkapi semua data!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        query Q = new query();
        Q.update(NIK, NAMA, ALAMAT, KELAMIN);
        JOptionPane.showMessageDialog(this, "Data berhasil diubah!", "Success", JOptionPane.INFORMATION_MESSAGE);
        table();
    }//GEN-LAST:event_tmupdateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(biodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(biodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(biodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(biodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new biodata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel STATUS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton laki;
    private javax.swing.JRadioButton perempuan;
    private javax.swing.JTextField stu;
    private javax.swing.JTable table;
    private javax.swing.JTextField talamat;
    private javax.swing.JButton tmhapus;
    private javax.swing.JButton tmsimpan;
    private javax.swing.JButton tmupdate;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField tnik;
    // End of variables declaration//GEN-END:variables
}
