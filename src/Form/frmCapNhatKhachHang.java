
package Form;

import DATABASE.Model;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import DataContext.KhachHang;
import DataTier.KhachHangDT;
import java.sql.Connection;
import java.sql.PreparedStatement;







public class frmCapNhatKhachHang extends javax.swing.JFrame {
    DefaultTableModel model;
    private String MaKhachHang;
     
    
    public frmCapNhatKhachHang() throws Exception {
        initComponents();
        Settable();
        loadData();
        setquyen(false);
        Reset();
    }
    
    
   
    public void Reset(){
       txtcccd.setText("");
       txtDiaChi.setText("");
       txtTenKhachHang.setText("");
       txtSoDienThoai.setText("");
       txtTenCongTy.setText("");     
    }
    
    
    
    private void setquyen( boolean y){
        boolean n;
        if(y == true){
            n=false;
        }
        else
            n=true;
        btnSua.setEnabled(y);
        btnXoa.setEnabled(y);
        btnThem.setEnabled(n);
        
           
    }
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSoDienThoai = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        lblTenKhachHang = new javax.swing.JLabel();
        txtTenKhachHang = new javax.swing.JTextField();
        lblCCCD = new javax.swing.JLabel();
        txtcccd = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        lblDiaChi = new javax.swing.JLabel();
        lolTenCongTy = new javax.swing.JLabel();
        txtTenCongTy = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        btnThoai = new javax.swing.JButton();
        lblTimKiem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSKhachHang = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lblDSKhachHang = new javax.swing.JLabel();
        btnThem1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(189, 215, 238));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cập Nhật Thông Tin Khách Hàng");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
        );

        lblSoDienThoai.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblSoDienThoai.setText("Số Điện Thoại");

        txtSoDienThoai.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        lblTenKhachHang.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblTenKhachHang.setText("Tên Khách Hàng");

        txtTenKhachHang.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        lblCCCD.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblCCCD.setText("CCCD/CMND");

        txtcccd.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtDiaChi.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        lblDiaChi.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblDiaChi.setText("Địa Chỉ");

        lolTenCongTy.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lolTenCongTy.setText("Công Ty");

        txtTenCongTy.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        btnThem.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemKhachHang(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnSua.setText("Sủa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuaKhachHang(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaKhachHang(evt);
            }
        });

        txtTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TimKiemKhachHang(evt);
            }
        });

        btnThoai.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnThoai.setText("Thoát");
        btnThoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToiFormKhachHang(evt);
            }
        });

        lblTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblTimKiem.setText("Tìm Kiếm");

        tblDSKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblDSKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LayDuLieu(evt);
            }
        });
        jScrollPane1.setViewportView(tblDSKhachHang);

        lblDSKhachHang.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblDSKhachHang.setText("Danh sách khách hàng");

        btnThem1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnThem1.setText("Hủy");
        btnThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huy(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lolTenCongTy, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenCongTy, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDSKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblSoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(lblTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtTimKiem))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcccd, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1098, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lolTenCongTy, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenCongTy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcccd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(lblDSKhachHang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private boolean KiemTra(){
        if(txtTenKhachHang.getText().equals("")|| txtDiaChi.getText().equals("")|| 
                txtSoDienThoai.getText().equals("")|| txtcccd.getText().equals("")){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    
    
    private void ThemKhachHang(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemKhachHang
        if(KiemTra() == true){
            JOptionPane.showMessageDialog(this, "Vui Lòng điền Đầy đủ thông tin");
        }
        else{
            try {
                 Connection cn = Model.opConnection();
                KhachHang kh = new KhachHang();
                String makh="SELECT SUBSTRING(MaKhachHang,3 ,4)AS Dem FROM tblKhachHang";
                PreparedStatement demkh = cn.prepareStatement(makh);
                ResultSet dem = demkh.executeQuery();
                int tam=0;
                if(dem != null){
                   while(dem.next()){
                       tam = Integer.parseInt(dem.getString("Dem"));
                    }
                    tam++;
                    if(tam < 10)
                    {
                         kh.setMaKhachHang("KH000"+tam);
                    }
                    else if(tam < 100){
                         kh.setMaKhachHang("KH00"+tam);
                    }
                    else if(tam < 1000){
                         kh.setMaKhachHang("KH0"+tam);
                    }
                    else {
                         kh.setMaKhachHang("KH"+tam);
                    }
                }
                else
                {     
                     kh.setMaKhachHang("KH0001");


                }
               
                kh.setTenKhachHang(txtTenKhachHang.getText());
                kh.setDiaChi(txtDiaChi.getText());
                kh.setSoDienThoai(txtSoDienThoai.getText());
                kh.setCCCD(txtcccd.getText());
                kh.setTenCongTy(txtTenCongTy.getText());
                KhachHangDT dao =new KhachHangDT();
                dao.ThemKhachHang(kh);
                JOptionPane.showMessageDialog(this, "Khách Hàng Đã Được Lưu");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,"Error" +e.getMessage());
                JOptionPane.showMessageDialog(this, "Nhân Viên không Được Lưu");
            }                                     
            loadData();
            setquyen(false);
            Reset();
        } 
    }//GEN-LAST:event_ThemKhachHang

    private void SuaKhachHang(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaKhachHang
        if(KiemTra() == true){
            JOptionPane.showMessageDialog(this, "Vui Lòng điền Đầy đủ thông tin");
        }
        else
        {
            if(JOptionPane.showConfirmDialog(this, "Bạn có Chắc với thông tin đã nhập hay không ?") == JOptionPane.YES_OPTION){
                try {
                    KhachHang kh =new KhachHang();
                    kh.setMaKhachHang(MaKhachHang);
                    kh.setTenKhachHang(txtTenKhachHang.getText());
                    kh.setDiaChi(txtDiaChi.getText());
                    kh.setSoDienThoai(txtSoDienThoai.getText());
                    kh.setCCCD(txtcccd.getText());
                    kh.setTenCongTy(txtTenCongTy.getText());
                    KhachHangDT dao =new KhachHangDT();
                    dao.SuaKhachHang(kh);
                    JOptionPane.showMessageDialog(this, "Nhân Viên Đã Được Cập Nhật");
                } 
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(this, "Nhân Viên không Được Lưu");
                }
                loadData();
                setquyen(false);
                Reset();
            }
        }
    }//GEN-LAST:event_SuaKhachHang

    private void XoaKhachHang(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaKhachHang
        if(JOptionPane.showConfirmDialog(this, "Bạn có Muốn xóa nhân viên hay không ?") == JOptionPane.NO_OPTION){
            return;  
        }
        try {
            KhachHangDT dao =new KhachHangDT();
            dao.XoaKhachHang(MaKhachHang);
            JOptionPane.showMessageDialog(this, "Nhân Viên Đã Được Xóa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Error" +e.getMessage());
            JOptionPane.showMessageDialog(this, "Nhân Viên không Được Lưu");
        
        }
            loadData();
            setquyen(false);
            Reset();
    }//GEN-LAST:event_XoaKhachHang

    private void TimKiemKhachHang(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TimKiemKhachHang
        try {
            KhachHangDT kh= new KhachHangDT();
       String text= txtTimKiem.getText().toString();
        ResultSet rs = kh.TimKiemKhachHang(text);
        model.setRowCount(0);
           while(rs .next()){
               String[] row = new String[]{
                   rs .getString("MaKhachHang"),
                   rs .getString("TenKhachHang"),
                   rs .getString("DiaChi"),
                   rs .getString("SoDienThoai"),
                   rs .getString("CCCD"),
                   rs .getString("TenCongTy"),
               };
                model.addRow(row);    
            }
            model.fireTableDataChanged();
            rs.close();
        } catch (Exception e) {
        }
       
    }//GEN-LAST:event_TimKiemKhachHang

    private void LayDuLieu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LayDuLieu
       int index = tblDSKhachHang.getSelectedRow();
       MaKhachHang =tblDSKhachHang.getValueAt(index,0).toString();
       txtTenKhachHang.setText(tblDSKhachHang.getValueAt(index,1).toString());
       txtDiaChi.setText(tblDSKhachHang.getValueAt(index,2).toString());
       txtSoDienThoai.setText(tblDSKhachHang.getValueAt(index,3).toString());
       txtcccd.setText(tblDSKhachHang.getValueAt(index,4).toString());
       txtTenCongTy.setText(tblDSKhachHang.getValueAt(index,5).toString());
       setquyen(true);
    }//GEN-LAST:event_LayDuLieu

    private void ToiFormKhachHang(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToiFormKhachHang
        try {
            frmKhachHang kh=new frmKhachHang();
            this.setVisible(false);
            kh.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(frmKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ToiFormKhachHang

    private void huy(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huy
        setquyen(false);
        Reset();
    }//GEN-LAST:event_huy


    
    public void Settable(){
        model = new DefaultTableModel();
        model.setColumnIdentifiers(new String []{"Mã Khách Hàng"," Tên Khách Hàng"," Địa Chỉ","Số Điện Thoại"," CCCD","Tên Công Ty"});
        tblDSKhachHang.setModel(model);
        
    }
    public void loadData(){
        try {
            KhachHangDT kh= new KhachHangDT();
            ResultSet khachhang = kh.DanhSachKhachHang();
            model.setRowCount(0);
                while(khachhang.next()){
                    String[] row = new String[]{
                        khachhang.getString("MaKhachHang"),
                        khachhang.getString("TenKhachHang"),
                        khachhang.getString("DiaChi"),
                        khachhang.getString("SoDienThoai"),
                        khachhang.getString("CCCD"),
                        khachhang.getString("TenCongTy"),
                    };
                    model.addRow(row);    
                }
            model.fireTableDataChanged();
            khachhang.close();
        } catch (Exception e) {
        }
        
    }
    
    

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
            java.util.logging.Logger.getLogger(frmCapNhatKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCapNhatKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCapNhatKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCapNhatKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmCapNhatKhachHang().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(frmCapNhatKhachHang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThem1;
    private javax.swing.JButton btnThoai;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCCCD;
    private javax.swing.JLabel lblDSKhachHang;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblSoDienThoai;
    private javax.swing.JLabel lblTenKhachHang;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JLabel lolTenCongTy;
    private javax.swing.JTable tblDSKhachHang;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenCongTy;
    private javax.swing.JTextField txtTenKhachHang;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtcccd;
    // End of variables declaration//GEN-END:variables
}
