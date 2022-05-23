
package Form;

import DataTier.HopDongDT;
import DataTier.NhanVienDT;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmHopDong extends javax.swing.JFrame {
    DefaultTableModel model,model1;

    public frmHopDong() {
        initComponents();
        setbackground();
        Settable();
        loadData();
        Settable1();
    }
    
    
    
    
    
    
    
     public void setbackground(){
        btnDatXe.setBackground(Color.WHITE);
        btnXe.setBackground(Color.WHITE);
        btnHopDong.setBackground(Color.WHITE);
        btnKhachHang.setBackground(Color.WHITE);
        btnDangXuat.setBackground(Color.WHITE);
    }
     
     
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        lblTimKiem = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDSHopDong = new javax.swing.JTable();
        btnDatXe = new javax.swing.JButton();
        btnXe = new javax.swing.JButton();
        btnKhachHang = new javax.swing.JButton();
        btnHopDong = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDScthd = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(189, 215, 238));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hợp Đồng");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TimKiemNhanVien(evt);
            }
        });

        lblTimKiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTimKiem.setText("Tìm Kiếm");

        tblDSHopDong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblDSHopDong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSHopDongMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDSHopDong);

        btnDatXe.setBackground(new java.awt.Color(189, 215, 238));
        btnDatXe.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnDatXe.setText("Đặt Xe");
        btnDatXe.setBorder(null);
        btnDatXe.setBorderPainted(false);
        btnDatXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDatXeMouseClicked(evt);
            }
        });

        btnXe.setBackground(new java.awt.Color(189, 215, 238));
        btnXe.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnXe.setText("Xe");
        btnXe.setAlignmentY(0.0F);
        btnXe.setBorder(null);
        btnXe.setBorderPainted(false);
        btnXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXeMouseClicked(evt);
            }
        });
        btnXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToiFormXe(evt);
            }
        });

        btnKhachHang.setBackground(new java.awt.Color(189, 215, 238));
        btnKhachHang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnKhachHang.setText("Khách Hàng");
        btnKhachHang.setAlignmentY(0.0F);
        btnKhachHang.setBorder(null);
        btnKhachHang.setBorderPainted(false);
        btnKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKhachHangMouseClicked(evt);
            }
        });

        btnHopDong.setBackground(new java.awt.Color(189, 215, 238));
        btnHopDong.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnHopDong.setText("Hợp Đồng");
        btnHopDong.setAlignmentY(0.0F);
        btnHopDong.setBorder(null);
        btnHopDong.setBorderPainted(false);
        btnHopDong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHopDongMouseClicked(evt);
            }
        });

        btnNhanVien.setBackground(new java.awt.Color(189, 215, 238));
        btnNhanVien.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnNhanVien.setText("Nhân Viên");
        btnNhanVien.setAlignmentY(0.0F);
        btnNhanVien.setBorder(null);
        btnNhanVien.setBorderPainted(false);

        btnDangXuat.setBackground(new java.awt.Color(189, 215, 238));
        btnDangXuat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.setAlignmentY(0.0F);
        btnDangXuat.setBorder(null);
        btnDangXuat.setBorderPainted(false);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        tblDScthd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblDScthd);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnDatXe, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXe, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(63, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDatXe, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXe, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(110, 110, 110)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTimKiem))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(250, 250, 250)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
  
    
        // gán cột cho bảng 
    public void Settable(){
        model =new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Mã Hợp Đồng","Tổng Tiền","Ngày Lập HĐ","Tên Nhân Viên","Tên Khách",});
        tblDSHopDong.setModel(model);
            
    }
    public void Settable1(){
        model1 =new DefaultTableModel();
        model1.setColumnIdentifiers(new String[]{"Mã Hợp Đồng","Tên Xe","Ngày Nhận Xe","Ngày Trả Xe",});
        tblDScthd.setModel(model1);
            
    }
    
    
    
    
    
    
    
        // Đưa dữ liệu lên bảng
    public void loadData() {
        try {
            HopDongDT hd= new HopDongDT();
            ResultSet rs = hd.DanhSachHopDong();
            model.setRowCount(0);
            while(rs.next()){
                String[] row = new String[]{
                    rs.getString("MaHopDong"),
                    rs.getString("TongTien"),
                    rs.getString("NgayLap"),
                    rs.getString("TenNhanVien"),
                    rs.getString("TenKhachHang"),
                };
                model.addRow(row);    
            }
            model.fireTableDataChanged();
            rs.close();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    
    
    
    
    private void TimKiemNhanVien(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TimKiemNhanVien
        try {
            NhanVienDT nv= new NhanVienDT();
            ResultSet rs = nv.TimKiemNhanVien(txtTimKiem.getText().toString());
            model.setRowCount(0);
            while(rs.next()){
                String[] row = new String[]{
                    rs.getString("MaNhanVien"),
                    rs.getString("TenNhanVien"),
                    rs.getString("DiaChi"),
                    rs.getString("SoDienThoai"),
                    rs.getString("CCCD"),
                    rs.getString("GioiTinh"),
                    rs.getString("NgaySinh"),
                };
                model.addRow(row);
            }
            model.fireTableDataChanged();
            rs.close();
        } catch (Exception e) {
              JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_TimKiemNhanVien

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed

    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void ToiFormXe(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToiFormXe
        try {
            frmXe xe=new frmXe();
            this.setVisible(false);
            xe.setVisible(true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_ToiFormXe

    private void btnDatXeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDatXeMouseClicked
        try {
            frmDatXe dx=new frmDatXe();
            this.setVisible(false);
            dx.setVisible(true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_btnDatXeMouseClicked

    private void btnXeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXeMouseClicked
        try {
            frmXe xe=new frmXe();
            this.setVisible(false);
            xe.setVisible(true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_btnXeMouseClicked

    private void btnKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhachHangMouseClicked
        try {
            frmKhachHang kh=new frmKhachHang();
            this.setVisible(false);
            kh.setVisible(true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_btnKhachHangMouseClicked

    private void btnHopDongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHopDongMouseClicked
        try {
            frmHopDong hd=new frmHopDong();
            this.setVisible(false);
            hd.setVisible(true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_btnHopDongMouseClicked

    private void tblDSHopDongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSHopDongMouseClicked
        try {
            int index = tblDSHopDong.getSelectedRow();
            HopDongDT hd= new HopDongDT();
            String mhd = tblDSHopDong.getValueAt(index, 0).toString();
            ResultSet rs = hd.DanhSachctHopDong(mhd);
            model1.setRowCount(0);
            while(rs.next()){
                String[] row = new String[]{
                    rs.getString("MaHopDong"),
                    rs.getString("TenXe"),
                    rs.getString("NgayGiao"),
                    rs.getString("NgayTra"),
                };
                model1.addRow(row);    
            }
            model1.fireTableDataChanged();
            rs.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tblDSHopDongMouseClicked

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
            java.util.logging.Logger.getLogger(frmHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHopDong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDatXe;
    private javax.swing.JButton btnHopDong;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnXe;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JTable tblDSHopDong;
    private javax.swing.JTable tblDScthd;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
