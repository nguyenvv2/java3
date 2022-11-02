/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlysach.view;

import quanlysach.model.Sach;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import quanlysach.service.QuanLySachService;
import quanlysach.service.impl.QuanLySachImpl;

/**
 *
 * @author Nguyenvv
 */
public class SachForm extends javax.swing.JFrame {

    private DefaultTableModel defaultTableModel;
    private DefaultComboBoxModel defaultComboBoxModel;
    private QuanLySachService quanLySachService = new QuanLySachImpl();

    private List<Sach> listSach = new ArrayList<>();

    public SachForm() {
        initComponents();
        theLoai();
        addColumn();
        addNamIn();
        loadData(quanLySachService.getList());
    }

    ButtonGroup buttonGroup = new ButtonGroup();

    public void theLoai() {
        buttonGroup.add(rd_tieuthuyet);
        buttonGroup.add(rd_truyenngan);
    }

    public void addColumn() {
        ArrayList<String> listColumn = new ArrayList<>();
        listColumn.add("Tên sách");
        listColumn.add("Tác giả");
        listColumn.add("Thể loại");
        listColumn.add("Năm in");
        defaultTableModel = (DefaultTableModel) tb_table.getModel();
        for (String item : listColumn) {
            defaultTableModel.addColumn(item);
        }
    }

    public void addNamIn() {
        ArrayList<String> listNamIn = new ArrayList<>();
        listNamIn.add("2010");
        listNamIn.add("2011");
        listNamIn.add("2012");
        listNamIn.add("2013");
        listNamIn.add("2014");
        listNamIn.add("2015");
        listNamIn.add("2016");
        listNamIn.add("2017");
        listNamIn.add("2018");
        listNamIn.add("2019");
        listNamIn.add("2020");

        defaultComboBoxModel = (DefaultComboBoxModel) cb_namin.getModel();
        for (String item : listNamIn) {
            defaultComboBoxModel.addElement(item);
        }
    }

    public String getTenTheLoai(int theLoai) {
        if (theLoai == 1) {
            return "Truyện ngắn";
        } else if (theLoai == 2) {
            return "Tiểu thuyết";
        } else {
            return null;
        }
    }

    public void loadData(ArrayList<Sach> list) {
        defaultTableModel = (DefaultTableModel) tb_table.getModel();
        defaultTableModel.setRowCount(0);
        for (Sach x : list) {
            defaultTableModel.addRow(new Object[]{
                x.getTen(), x.getTacGia(), getTenTheLoai(x.getTheLoai()), x.getNamIn()
            });
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_tensach = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_tacgia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rd_truyenngan = new javax.swing.JRadioButton();
        rd_tieuthuyet = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        cb_namin = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_table = new javax.swing.JTable();
        btn_them = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_thoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setText("Quản Lý Sách");

        jLabel2.setText("Tên Sách");

        jLabel3.setText("Tác Giả");

        jLabel4.setText("Thể Loại");

        rd_truyenngan.setText("Truyện ngắn");

        rd_tieuthuyet.setText("Tiểu thuyết");

        jLabel5.setText("Năm in");

        tb_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_table);

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_thoat.setText("Thoát");
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(50, 50, 50))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(60, 60, 60)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(54, 54, 54)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(59, 59, 59)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cb_namin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rd_truyenngan, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rd_tieuthuyet))
                            .addComponent(txt_tensach, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_tacgia, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_tensach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_them))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_tacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_truyenngan)
                    .addComponent(jLabel4)
                    .addComponent(rd_tieuthuyet)
                    .addComponent(btn_clear))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_namin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_thoat))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed

        Sach s1 = new Sach();
        s1.setTen(txt_tensach.getText());
        s1.setTacGia(txt_tacgia.getText());
        if (rd_truyenngan.isSelected()) {
            s1.setTheLoai(1);
        } else if (rd_tieuthuyet.isSelected()) {
            s1.setTheLoai(2);
        }
        s1.setNamIn(Integer.parseInt(cb_namin.getSelectedItem().toString()));
        String kq = quanLySachService.addSach(s1);
        JOptionPane.showMessageDialog(this, kq);
        loadData(quanLySachService.getList());
    
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        int remove = tb_table.getSelectedRow();
        if (remove == -1) {
            JOptionPane.showMessageDialog(this, "Hãy chọn 1 dòng rồi xóa!");
        } else {
            int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa \"" + tb_table.getValueAt(remove, 0) + " \"ra khỏi danh sách ?", "Xóa", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (choice == JOptionPane.YES_OPTION) {
                listSach.remove(remove);
//                loadData();
                JOptionPane.showMessageDialog(this, "Xóa thành công!");
            }
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txt_tacgia.setText("");
        txt_tensach.setText("");
        buttonGroup.clearSelection();
        cb_namin.setSelectedIndex(5);
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát khỏi chương trình ?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Đã thoát khỏi chương trình!");
            System.exit(0);
        }
    }//GEN-LAST:event_btn_thoatActionPerformed

    private void tb_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_tableMouseClicked
        int row = tb_table.getSelectedRow();
        txt_tensach.setText((String) tb_table.getValueAt(row, 0));
        txt_tacgia.setText((String) tb_table.getValueAt(row, 1));
        if (tb_table.getValueAt(row, 2).equals("Tiểu thuyết")) {
            rd_tieuthuyet.setSelected(true);
        } else {
            rd_truyenngan.setSelected(true);
        }
        cb_namin.setSelectedItem(tb_table.getValueAt(row, 3));
    }//GEN-LAST:event_tb_tableMouseClicked

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
            java.util.logging.Logger.getLogger(SachForm

.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SachForm

.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SachForm

.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SachForm

.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SachForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cb_namin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rd_tieuthuyet;
    private javax.swing.JRadioButton rd_truyenngan;
    private javax.swing.JTable tb_table;
    private javax.swing.JTextField txt_tacgia;
    private javax.swing.JTextField txt_tensach;
    // End of variables declaration//GEN-END:variables
}
