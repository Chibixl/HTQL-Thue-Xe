package Form;

import DATABASE.Model;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;



/**
 *
 * @author win10
 */
public class frmThongTinXe extends javax.swing.JFrame {
    DefaultTableModel model;
    public String MaXe="";
    byte[] anhxe;
    public String MaNV;
    private byte[] person_image = null;
    private Image bytesanganh=null;
    private JTable a;
    
    
    
    public frmThongTinXe() {
        initComponents();
        MaXe="XE0002";
        loadData();
        loadcmbHinhThuc();
    }
    
    
    private void loadcmbHinhThuc(){
        try {
            cmbhinhthuc.removeAllItems();
            cmbhinhthuc.addItem("Mời Chọn");  
            cmbhinhthuc.addItem("Ngày");  
            cmbhinhthuc.addItem("Tuần");  
            cmbhinhthuc.addItem("Tháng");
            cmbhinhthuc.addItem("Năm");
              
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
     public void Settable(){
        model =new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Mã Xe","Tên Xe","Màu Xe","Số Chỗ Ngồi","Gía Thuê"
                + "","Năm Sản Xuất","Biển Số Xe","Trạng Thái","Tên Hãng"});
        a.setModel(model);
        loadData();
            
    }
    public void loadData() {
       try {
           String sql ="select * from tblHangXe H,tblXe X WHERE H.MaHang=X.MaHang and MaXe ='"+MaXe+"'";
            Connection cn = Model.opConnection();
            PreparedStatement xe =cn.prepareStatement(sql);
            ResultSet rs = xe.executeQuery();
            
            
            //model.setRowCount(0);
            while(rs.next()){
               // String[] row = new String[]{
                txtTenXe.setText(rs.getString("TenXe"));
                txtMauXe.setText( rs.getString("MauXe"));
                txtSoChoNgoi.setText( rs.getString("SoChoNgoi"));
                txtGiaThue.setText( rs.getString("GiaThue"));
                txtNamSanXuat.setText( rs.getString("NamSanXuat"));
                txtBienSoXe.setText(rs.getString("BienSoXe"));
                txtGiaThue.setText(rs.getString("GiaThue"));
                txtHangXe.setText( rs.getString("TenHang"));
                
                person_image=rs.getBytes("AnhXe");
                MaXe =rs.getString("MaXe");
                };
                ImageIcon newimage = new ImageIcon(new ImageIcon(person_image).getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(),Image.SCALE_SMOOTH));
                lblImage.setIcon(newimage);
            rs.close();
        } catch (Exception e) {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblMaNhanVien = new javax.swing.JLabel();
        lblSoDienThoai = new javax.swing.JLabel();
        txtTenXe = new javax.swing.JTextField();
        txtMauXe = new javax.swing.JTextField();
        lblTenNhanVien = new javax.swing.JLabel();
        lblCCCD = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        lblMatKhau = new javax.swing.JLabel();
        txtNamSanXuat = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        lblNgaySinh = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();
        txtSoChoNgoi = new javax.swing.JTextField();
        txtBienSoXe = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        txtGiaThue = new javax.swing.JTextField();
        txtHangXe = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        btnThem2 = new javax.swing.JButton();
        btnThem1 = new javax.swing.JButton();
        lblMaNhanVien1 = new javax.swing.JLabel();
        lblSoDienThoai1 = new javax.swing.JLabel();
        lblSoLuong = new javax.swing.JLabel();
        lblDiaChi1 = new javax.swing.JLabel();
        lblNgaySinh2 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        cmbhinhthuc = new javax.swing.JComboBox<>();
        NgayNhan = new com.toedter.calendar.JDateChooser();
        ngaytra = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(189, 215, 238));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thông Tin Xe");

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

        lblMaNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblMaNhanVien.setText("Tên Xe");

        lblSoDienThoai.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblSoDienThoai.setText("Màu Xe");

        txtTenXe.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtMauXe.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        lblTenNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblTenNhanVien.setText("Hãng Xe");

        lblCCCD.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblCCCD.setText("Số Chỗ Ngồi");

        lblDiaChi.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblDiaChi.setText("Năm Sản Xuất");

        lblMatKhau.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblMatKhau.setText("Giá Thuê");

        txtNamSanXuat.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        btnThem.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnThem.setText("Đặt Xe");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        lblNgaySinh.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblNgaySinh.setText("Biển Số Xe");

        lblGioiTinh.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblGioiTinh.setText("Hình Thức Thuê");

        txtSoChoNgoi.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtBienSoXe.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        txtGiaThue.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtHangXe.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtSoLuong.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtSoLuong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSoLuongKeyReleased(evt);
            }
        });

        btnThem2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnThem2.setText("Thêm Xe");

        btnThem1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnThem1.setText("Hủy");

        lblMaNhanVien1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblMaNhanVien1.setText("Ngày Nhận Xe");

        lblSoDienThoai1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblSoDienThoai1.setText("Ngày Trả Xe");

        lblSoLuong.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblSoLuong.setText("Số Tháng");

        lblDiaChi1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblDiaChi1.setText("Tổng Tiền");

        lblNgaySinh2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblNgaySinh2.setText("Ảnh Xe");

        txtTongTien.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtTongTien.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtTongTienPropertyChange(evt);
            }
        });
        txtTongTien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTongTienKeyPressed(evt);
            }
        });

        cmbhinhthuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbhinhthuc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbhinhthucItemStateChanged(evt);
            }
        });
        cmbhinhthuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbhinhthucKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbhinhthucKeyReleased(evt);
            }
        });

        NgayNhan.setDateFormatString("yyyy-MM-dd");
        NgayNhan.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                NgayNhanPropertyChange(evt);
            }
        });

        ngaytra.setDateFormatString("yyyy-MM-dd");
        ngaytra.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ngaytraPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addComponent(btnThem2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblNgaySinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSoDienThoai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMaNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNamSanXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                .addComponent(txtMauXe)
                                .addComponent(txtTenXe)
                                .addComponent(txtBienSoXe))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNgaySinh2, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btnThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMaNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NgayNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCCCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSoDienThoai1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSoChoNgoi, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                    .addComponent(txtHangXe)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cmbhinhthuc, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtGiaThue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ngaytra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(2, 2, 2))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDiaChi1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(183, 183, 183))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMauXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBienSoXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamSanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(lblNgaySinh2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHangXe)
                            .addComponent(lblTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtSoChoNgoi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGiaThue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbhinhthuc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NgayNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSoDienThoai1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(ngaytra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDiaChi1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
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

    private void cmbhinhthucKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbhinhthucKeyReleased

            
    }//GEN-LAST:event_cmbhinhthucKeyReleased

    private void cmbhinhthucKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbhinhthucKeyPressed
   
    }//GEN-LAST:event_cmbhinhthucKeyPressed

    private void cmbhinhthucItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbhinhthucItemStateChanged
      try {
            if(cmbhinhthuc.getSelectedItem()=="Tuần")
            {
                ngaytra.setEnabled(false);
                txtSoLuong.setEnabled(true);
                lblSoLuong.setText("Số Tuần");
            }
            else if(cmbhinhthuc.getSelectedItem()=="Tháng")
            {
                txtSoLuong.setText("0");
                ngaytra.setEnabled(false);
                txtSoLuong.setEnabled(true);
                lblSoLuong.setText("Số Tháng");
                txtSoLuong.setText("0");
            }
            else if(cmbhinhthuc.getSelectedItem()=="Năm")
            {
                txtSoLuong.setText("0");
                ngaytra.setEnabled(false);
                txtSoLuong.setEnabled(true);
                lblSoLuong.setText("Số Năm");
            }
            else if (cmbhinhthuc.getSelectedItem()=="Ngày"){
                txtSoLuong.setEnabled(false);
                 ngaytra.setEnabled(true);
                  lblSoLuong.setText("Số Ngày");
                
            }
            
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmbhinhthucItemStateChanged

    private void NgayNhanPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_NgayNhanPropertyChange
        try {
            if(cmbhinhthuc.getSelectedItem()=="Ngày")
            {
                txtSoLuong.setText("1");
            }
          
        } catch (Exception e) {
        }
    }//GEN-LAST:event_NgayNhanPropertyChange

    private void ngaytraPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ngaytraPropertyChange
      try {
            Date nhan,tra;
            nhan=  NgayNhan.getDate();
            tra= ngaytra.getDate();
            long a=Math.abs(nhan.getTime()-tra.getTime());
            long b =TimeUnit.DAYS.convert(a,TimeUnit.MILLISECONDS);
            b=b+1;
            txtSoLuong.setText(String.valueOf(b));
            tinhtien();
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_ngaytraPropertyChange

    private void txtTongTienKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTongTienKeyPressed
      
    }//GEN-LAST:event_txtTongTienKeyPressed

    private void txtTongTienPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtTongTienPropertyChange
       
       
    }//GEN-LAST:event_txtTongTienPropertyChange

    private void txtSoLuongKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoLuongKeyReleased
       tinhtien();
    }//GEN-LAST:event_txtSoLuongKeyReleased

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        frmThanhToan thanhtoan=new frmThanhToan();
         java.sql.Date c,d;
            c =new java.sql.Date( NgayNhan.getDate().getTime());
            d =new java.sql.Date( ngaytra.getDate().getTime());

        this.setVisible(false);
        thanhtoan.Setdsxedachon();
        thanhtoan.tbl.setRowCount(0);
        String[] row = new String[]{
             MaXe,
           c.toString(),
            d.toString(),
             txtSoLuong.getText(),
             txtTongTien.getText()
         };
        thanhtoan.MaNV=this.MaNV;
        thanhtoan.tbl.addRow(row);    
        thanhtoan.setVisible(true);
        thanhtoan.loadData();
       
    }//GEN-LAST:event_btnThemMouseClicked
private void tinhtien(){
    try {
            if(cmbhinhthuc.getSelectedItem()=="Tuần")
            {
              double ls =Double.parseDouble(txtSoLuong.getText());
              double gia =Double.parseDouble(txtGiaThue.getText());
              double tt=ls*(gia*5);
              txtTongTien.setText(String.valueOf(tt));
            }
            else if(cmbhinhthuc.getSelectedItem()=="Tháng")
            {
              double ls =Double.parseDouble(txtSoLuong.getText());
              double gia =Double.parseDouble(txtGiaThue.getText());
              double tt=ls*(gia*25);
              txtTongTien.setText(String.valueOf(tt));
            }
            else if(cmbhinhthuc.getSelectedItem()=="Năm")
            {
                 double ls =Double.parseDouble(txtSoLuong.getText());
              double gia =Double.parseDouble(txtGiaThue.getText());
              double tt=ls*(gia*(30*10));
              txtTongTien.setText(String.valueOf(tt));
            }
            else if (cmbhinhthuc.getSelectedItem()=="Ngày"){
                
              double ls =Double.parseDouble(txtSoLuong.getText());
              double gia =Double.parseDouble(txtGiaThue.getText());
              double tt=ls*gia;

              txtTongTien.setText(String.valueOf(tt));
              
            }
            
            
        } catch (Exception e) {
        }                                            

}
  
    
    
    
    
    
    
    
    
    
    
     public static byte[] anhsangbyte(Image img, String type) {
        try {
            BufferedImage bimage= new BufferedImage(img.getWidth(null),img.getHeight(null),BufferedImage.TYPE_INT_BGR);
            Graphics2D g =bimage.createGraphics();
            g.drawImage(img, 0,0,null);
            g.dispose();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bimage,type,baos);
            byte[] imgByte =baos.toByteArray();
            return imgByte;
         } catch (Exception e) {
             return null;
         }
        
        
    }

        
    
    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmThongTinXe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser NgayNhan;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThem1;
    private javax.swing.JButton btnThem2;
    private javax.swing.JComboBox<String> cmbhinhthuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCCCD;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblDiaChi1;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblMaNhanVien;
    private javax.swing.JLabel lblMaNhanVien1;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblNgaySinh2;
    private javax.swing.JLabel lblSoDienThoai;
    private javax.swing.JLabel lblSoDienThoai1;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTenNhanVien;
    private com.toedter.calendar.JDateChooser ngaytra;
    private javax.swing.JTextField txtBienSoXe;
    private javax.swing.JTextField txtGiaThue;
    private javax.swing.JTextField txtHangXe;
    private javax.swing.JTextField txtMauXe;
    private javax.swing.JTextField txtNamSanXuat;
    private javax.swing.JTextField txtSoChoNgoi;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenXe;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables



   

  
}
