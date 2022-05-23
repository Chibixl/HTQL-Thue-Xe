
package Form;

import DataTier.NhanVienDT;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmNhanVien extends javax.swing.JFrame {
    DefaultTableModel model;

    public frmNhanVien() {
        initComponents();
        setbackground();
        Settable();
        loadData();
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
        btnCapNhatKhachHang = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        lblTimKiem = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDSNhanVien = new javax.swing.JTable();
        btnDatXe = new javax.swing.JButton();
        btnXe = new javax.swing.JButton();
        btnKhachHang = new javax.swing.JButton();
        btnHopDong = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(189, 215, 238));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nhân Viên");

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

        btnCapNhatKhachHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCapNhatKhachHang.setText("Cập Nhật Thông Tin Nhân Viên");
        btnCapNhatKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToifrmCNNV(evt);
            }
        });

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TimKiemNhanVien(evt);
            }
        });

        lblTimKiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTimKiem.setText("Tìm Kiếm");

        tblDSNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblDSNhanVien);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(48, 48, 48)
                            .addComponent(btnCapNhatKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(63, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 461, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDatXe, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXe, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(109, 109, 109)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCapNhatKhachHang)
                        .addComponent(lblTimKiem))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(109, 109, 109)))
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
        model.setColumnIdentifiers(new String[]{"Mã Nhân Viên","Tên Nhân Viên","Địa Chỉ","Số Điện Thoại","CCCD/CMND","Giới Tính"
                + "","Ngày Sinh"," Chức Vụ"});
        tblDSNhanVien.setModel(model);
            
    }
    
    
    
    
    
    
    
        // Đưa dữ liệu lên bảng
    public void loadData() {
        try {
            NhanVienDT nv= new NhanVienDT();
            ResultSet rs = nv.DanhSachNhanVien();
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
                    rs.getString("TenChucVu")
                };
                model.addRow(row);    
            }
            model.fireTableDataChanged();
            rs.close();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    
    
    
    
    private void ToifrmCNNV(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToifrmCNNV
        try {
            frmCapNhatNhanVien cnnv=new frmCapNhatNhanVien();
            this.setVisible(false);
            cnnv.setVisible(true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_ToifrmCNNV

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
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhatKhachHang;
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
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JTable tblDSNhanVien;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
