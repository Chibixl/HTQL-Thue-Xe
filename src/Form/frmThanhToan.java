package Form;

import DATABASE.Model;
import DataContext.ChiTietHopDong;
import DataContext.HoaDon;
import DataContext.HopDong;
import DataTier.ChiTietHopDongDT;
import DataTier.HoaDonDT;
import DataTier.HopDongDT;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class frmThanhToan extends javax.swing.JFrame {
    DefaultTableModel model,tbl;
    private String MaXe;
    public String MaNV;
    String sochongoi,gia,TongTien;
    Date NgayNhan,NgayTra;
    javax.swing.JTable dsxedachon;
    
    
    
    
    
    public frmThanhToan() {
        initComponents();
        loadCMBHangXe();
        loadCMBKhachHang();
        Settable();
        txtTenNhanVien.setText("hello");
    }
     private void loadCMBKhachHang(){
        try {
            try {
                 Connection cn = Model.opConnection();
            String laydschucvu ="select TenKhachHang from tblKhachHang";
            PreparedStatement cv =cn.prepareStatement(laydschucvu);
            ResultSet rs = cv.executeQuery();
            cmbTenKhachHang.removeAllItems();
            while(rs.next()){
                cmbTenKhachHang.addItem(rs.getString("TenKhachHang"));
            }
            rs.close();
            cv.close();
            cn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void loadCMBHangXe(){
        try {
            cmbPhuongThucThanhToan.removeAllItems();
            cmbPhuongThucThanhToan.addItem("Tiền Mặt");
            cmbPhuongThucThanhToan.addItem("Thẻ Ngân Hàng");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }


    
        // gán cột cho bảng 
    public void Settable(){
        model =new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Tên Xe","Số Chỗ Ngồi","Ngày Nhận Xe"
                + "","Ngày Trả Xe","Gía Thuê","Tổng Tiền",});
        tblDSXe.setModel(model);       
    }
    public void Setdsxedachon(){
        dsxedachon = new JTable();
        tbl = new DefaultTableModel();
        
        tbl.setColumnIdentifiers(new String[]{"Tên Xe","Ngày Nhận Xe",""
                + " Ngày Trả Xe","Số Ngày","Tổng Tiền",});
        dsxedachon.setModel(tbl); 
    }
    
    
    
    
    
    
    
    
        // Đưa dữ liệu lên bảng
    public void loadData() {
        try {
            MaXe=dsxedachon.getValueAt(0,0).toString();
            String sql="Select TenXe from tblXe where MaXe='"+dsxedachon.getValueAt(0,1)+"'";
            String nv="Select TenNhanVien from tblNhanVien where MaNhanVien='"+MaNV+"'";
            Connection cn = Model.opConnection();
            PreparedStatement nv1 = cn.prepareStatement(nv);
            ResultSet nv2 = nv1.executeQuery();
            PreparedStatement xe = cn.prepareStatement(sql);
            while(nv2.next()){
                txtTenNhanVien.setText(nv2.getString("TenNhanVien").toString());
 
            }
            int stt= dsxedachon.getRowCount();
            for(int i =0; i<stt;i++){
                 String timxe="Select TenXe,SoChoNgoi from tblXe where MaXe='"+MaXe+"'";
                 PreparedStatement xe1 = cn.prepareStatement(timxe);
                 ResultSet xe2 = xe1.executeQuery();
                 model.setRowCount(0);
                 while(xe2.next()){
                    String[] row = new String[]{
                    xe2.getString("TenXe"),
                    xe2.getString("SoChoNgoi"),
                        
                    dsxedachon.getValueAt(i, 1).toString(),
                    dsxedachon.getValueAt(i, 2).toString(),
                    dsxedachon.getValueAt(i, 3).toString(),
                    dsxedachon.getValueAt(i, 4).toString(),
                };
                model.addRow(row);  
                }
                }
               int dem =tblDSXe.getRowCount();
               double  TongTien=0.0;
               for(int i =0; i<stt;i++){   
                   TongTien+= Double.parseDouble(tblDSXe.getValueAt(i,5).toString());
                }
               txtTongTien.setText(String.valueOf(TongTien));
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSoDienThoai = new javax.swing.JLabel();
        txtTenNhanVien = new javax.swing.JTextField();
        lblCCCD = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnThoai = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSXe = new javax.swing.JTable();
        lblDSKhachHang = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        cmbPhuongThucThanhToan = new javax.swing.JComboBox<>();
        cmbTenKhachHang = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(189, 215, 238));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thanh Toán");

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
        lblSoDienThoai.setText("Tên Nhân Viên");

        txtTenNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        lblCCCD.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblCCCD.setText("Tổng Tiền");

        btnThem.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnThem.setText("Thanh Toán");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThemXe(evt);
            }
        });

        btnThoai.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnThoai.setText("Thoát");
        btnThoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoaiToiFormNhanVien(evt);
            }
        });

        tblDSXe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblDSXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSXeLayDuLieu(evt);
            }
        });
        jScrollPane1.setViewportView(tblDSXe);

        lblDSKhachHang.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblDSKhachHang.setText("Danh sách Xe");

        lblNgaySinh.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblNgaySinh.setText("Tên Khách Hàng");

        lblGioiTinh.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblGioiTinh.setText("Phương Thức Thanh Toán");

        txtTongTien.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        cmbPhuongThucThanhToan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbPhuongThucThanhToan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbTenKhachHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbPhuongThucThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDSKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(btnThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDSKhachHang)
                    .addComponent(lblSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPhuongThucThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(152, Short.MAX_VALUE))
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

    private void tblDSXeLayDuLieu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSXeLayDuLieu
  
    }//GEN-LAST:event_tblDSXeLayDuLieu

    private void btnThoaiToiFormNhanVien(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoaiToiFormNhanVien
        try {
            frmDatXe dx=new frmDatXe();
            this.setVisible(false);
            dx.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lỗi Không thể mở trang Nhân Viên");
        }
    }//GEN-LAST:event_btnThoaiToiFormNhanVien

    private void ThemXe(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThemXe
        try {
            ////// Thêm Hợp Đồng
            Connection cn = Model.opConnection();
            HopDong hd =new HopDong();
            String mahd="SELECT SUBSTRING(MaHopDong,3 ,4)AS Dem FROM tblHopDong";
            PreparedStatement demhd = cn.prepareStatement(mahd);
            ResultSet dem = demhd.executeQuery();
            int tam=0;
            if(dem != null){
               while(dem.next()){
                   tam = Integer.parseInt(dem.getString("Dem"));
                }
                tam++;
                if(tam < 10)
                {
                     hd.setMaHopDong("HD000"+tam);
                }
                else if(tam < 100){
                     hd.setMaHopDong("HD00"+tam);
                }
                else if(tam < 1000){
                     hd.setMaHopDong("HD0"+tam);
                }
                else {
                     hd.setMaHopDong("HD"+tam);
                }
            }
            else
            {     
                 hd.setMaHopDong("HD0001");
                
                    
            }

            long millis=System.currentTimeMillis();
            java.sql.Date date=new java.sql.Date(millis);  
            hd.setNgayLap(date);
            
            double tt=Double.parseDouble(txtTongTien.getText().trim());
            hd.setTongTien(tt);
            String manv="SELECT MaNhanVien FROM tblNhanVien where TenNhanVien=N'"+txtTenNhanVien.getText().trim()+"'";
            PreparedStatement manv1 = cn.prepareStatement(manv);
            ResultSet manv2 = manv1.executeQuery();
            while(manv2.next()){
                MaNV = manv2.getString("MaNhanVien");
            }
            hd.setMaNhanVien(MaNV);
            String Makh="";
            String tkh=cmbTenKhachHang.getSelectedItem().toString();
            String mahd1="SELECT MaKhachHang FROM tblKhachHang where TenKhachHang=N'"+tkh+"'";
            PreparedStatement mahd2 = cn.prepareStatement(mahd1);
            ResultSet mahd3 = mahd2.executeQuery();
            while(mahd3.next()){
                Makh = mahd3.getString("MaKhachHang");
            }
            hd.setMaKhachHang(Makh);
            HopDongDT hopdong= new HopDongDT();
            hopdong.ThemHopDong(hd);
            System.out.println("them hd thanh cong");
            
            //them Chi Tiet Hop Dong
            int demsoxe=tblDSXe.getRowCount();
            for (int i=0;i<demsoxe;i++){
                ChiTietHopDong ct=new ChiTietHopDong();
                ct.setMaHopDong(hd.getMaHopDong());
                ct.setMaXe(MaXe);
                System.out.println(MaXe);
                SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
                Date ngayn = formatter.parse(tblDSXe.getValueAt(i,2).toString());
                Date ngayt=  formatter.parse(tblDSXe.getValueAt(i,3).toString());
                ct.setNgaynhanxe(new java.sql.Date(ngayn.getTime()));
                ct.setNgaytraxe(new java.sql.Date(ngayt.getTime()));
                ChiTietHopDongDT cthd= new ChiTietHopDongDT();
                cthd.ThemCT(ct);
                System.out.println("them ct thanh cong");
            }
            
            
            
            // Them HoaDon
            HoaDon hoad=new HoaDon();
            hoad.setMaHoaDon(mahd1);
            String mahoad="SELECT SUBSTRING(MaHoaDon,3 ,4)AS Dem FROM tblHoaDon";
            PreparedStatement demhoad1 = cn.prepareStatement(mahoad);
            ResultSet demhoad2 = demhoad1.executeQuery();
            int c=0;
            if(demhoad2 != null){
               while(demhoad2.next()){
                   c = Integer.parseInt(demhoad2.getString("Dem"));
                }
                c++;
                if(c < 10)
                {
                    hoad.setMaHoaDon("HO000"+c);
                }
                else if(tam < 100){
                     hoad.setMaHoaDon("HO00"+c);
                }
                else if(tam < 1000){
                     hoad.setMaHoaDon("HO0"+c);
                }
                else {
                     hoad.setMaHoaDon("HO"+c);
                }
            }
            else
            {     
                 hoad.setMaHoaDon("HO0001");
                
                    
            }
           
            hoad.setMaHopDong(hd.getMaHopDong());
            hoad.setNgayLap(date);
            hoad.setTongTien(tt);
            HoaDonDT hoadon= new HoaDonDT();
            hoadon.ThemHoaDon(hoad);
            System.out.println("them hoadon thanh cong");
            frmDatXe dx= new frmDatXe();
            this.setVisible(false);
            dx.setVisible(true);
            dx.index=0;
            dx.MaNV=hd.getMaNhanVien();
        } catch (Exception e) {
            System.out.println("loi");
        }
    }//GEN-LAST:event_ThemXe

  
    
    
    
    
    
    
    
    
    
    
    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmThanhToan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoai;
    private javax.swing.JComboBox<String> cmbPhuongThucThanhToan;
    private javax.swing.JComboBox<String> cmbTenKhachHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCCCD;
    private javax.swing.JLabel lblDSKhachHang;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblSoDienThoai;
    private javax.swing.JTable tblDSXe;
    private javax.swing.JTextField txtTenNhanVien;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables


}

