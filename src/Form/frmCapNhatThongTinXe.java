package Form;

import DATABASE.Model;
import DataContext.Xe;
import DataTier.ChinhAnh;
import DataTier.XeDT;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import javax.swing.table.DefaultTableModel;



/**
 *
 * @author win10
 */
public class frmCapNhatThongTinXe extends javax.swing.JFrame {
    DefaultTableModel model;
    private String MaXe;
    private String filename= null;
    private byte[] person_image= null;
    private Image bytesanganh=null;
    
    
    
    public frmCapNhatThongTinXe() {
        initComponents();
        loadCMBHangXe();
        loadCMBTinhTrang();
        loadcmbChoNgoi();
        Settable();
        Reset();
        loadData();
    }
    private void loadCMBHangXe(){
        try {
            Connection cnn = Model.opConnection();
            String sql ="select TenHang from tblHangXe";
            PreparedStatement nv =cnn.prepareStatement(sql);
            ResultSet rs = nv.executeQuery();
            cmbHangXe.removeAllItems();
            while(rs.next()){
                cmbHangXe.addItem(rs.getString("TenHang"));
            }
            rs.close();
            nv.close();
            cnn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void loadCMBTinhTrang(){
        try {
            cmbTrangThai.removeAllItems();
            cmbTrangThai.addItem("Đang Hoạt Động");
            cmbTrangThai.addItem("Đang Rảnh");
            cmbTrangThai.addItem("Đang Bảo Dưỡng");    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void loadcmbChoNgoi(){
        try {
            cmbSoChoNgoi.removeAllItems();
            cmbSoChoNgoi.addItem("2");
            cmbSoChoNgoi.addItem("4");
            cmbSoChoNgoi.addItem("7");
            cmbSoChoNgoi.addItem("12");    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

        // gán giá trị ban đầu cho form
    public void Reset(){
       txtBienSoXe.setText("");
       txtGiaThue.setText("");
       txtMauXe.setText("");
       txtNamSanXuat.setText("");
       txtTenXe.setText("");
       cmbHangXe.setSelectedIndex(0);
       cmbSoChoNgoi.setSelectedIndex(0);
       cmbTrangThai.setSelectedIndex(0);
       lblImage.setIcon(null);
       
           
    }

    
        // gán cột cho bảng 
    public void Settable(){
        model =new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Mã Xe","Tên Xe","Màu Xe","Số Chỗ Ngồi","Gía Thuê"
                + "","Năm Sản Xuất","Biển Số Xe","Trạng Thái","Tên Hãng"});
        tblDSXe.setModel(model);
            
    }
    
    
    
    
    
    
    
        // Đưa dữ liệu lên bảng
    public void loadData() {
        try {
            XeDT nv= new XeDT();
            ResultSet rs = nv.DanhSachNhanVien();
            model.setRowCount(0);
            while(rs.next()){
                String[] row = new String[]{
                    rs.getString("MaXe"),
                    rs.getString("TenXe"),
                    rs.getString("MauXe"),
                    rs.getString("SoChoNgoi"),
                    rs.getString("GiaThue"),
                    rs.getString("NamSanXuat"),
                    rs.getString("BienSoXe"),
                    rs.getString("TinhTrang"),
                    rs.getString("TenHang"),
                };
                model.addRow(row);    
            }
            model.fireTableDataChanged();
            rs.close();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
 
    private boolean KiemTra(){
        if(txtTenXe.getText()== ""|| txtBienSoXe.getText()==""|| 
                txtMauXe.getText()==""|| txtGiaThue.getText()==""|| txtNamSanXuat.getText()=="" ||
                lblImage.getIcon() == null){
            return true;
        }
        else{
            return false;
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
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        btnThoai = new javax.swing.JButton();
        lblTimKiem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSXe = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lblDSKhachHang = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();
        btnHangXe = new javax.swing.JButton();
        cmbHangXe = new javax.swing.JComboBox<>();
        txtGiaThue = new javax.swing.JTextField();
        txtBienSoXe = new javax.swing.JTextField();
        cmbSoChoNgoi = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        btnLoadAnh = new javax.swing.JButton();
        cmbTrangThai = new javax.swing.JComboBox<>();
        btnThem1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(189, 215, 238));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cập Nhật Thông Tin Xe");

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
        lblCCCD.setText("Giá Thuê");

        lblDiaChi.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblDiaChi.setText("Năm Sản Xuất");

        lblMatKhau.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblMatKhau.setText("Số Chỗ Ngồi");

        txtNamSanXuat.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        btnThem.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemXe(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnSua.setText("Sủa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuaXe(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaXe(evt);
            }
        });

        txtTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemTimKiemKhachHang(evt);
            }
        });

        btnThoai.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnThoai.setText("Thoát");
        btnThoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoaiToiFormNhanVien(evt);
            }
        });

        lblTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblTimKiem.setText("Tìm Kiếm");

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
        lblNgaySinh.setText("Biển Số Xe");

        lblGioiTinh.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblGioiTinh.setText("Trạng Thái");

        btnHangXe.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnHangXe.setText("Thêm Hãng Xe");
        btnHangXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHangXebtnToiFormChucVu(evt);
            }
        });

        cmbHangXe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbHangXe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtGiaThue.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtBienSoXe.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        cmbSoChoNgoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbSoChoNgoi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnLoadAnh.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnLoadAnh.setText("Load Ảnh");
        btnLoadAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadAnh(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLoadAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnLoadAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        cmbTrangThai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnThem1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnThem1.setText("Hủy");
        btnThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem1ThemXe(evt);
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
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1098, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(btnThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(lblMaNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDiaChi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNamSanXuat)
                                    .addComponent(txtMauXe, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                    .addComponent(txtTenXe)
                                    .addComponent(txtBienSoXe))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblCCCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(lblGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cmbHangXe, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnHangXe))
                                    .addComponent(txtGiaThue)
                                    .addComponent(cmbSoChoNgoi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbTrangThai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDSKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addGap(66, 66, 66))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTenXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbHangXe, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnHangXe, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMauXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtGiaThue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBienSoXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNamSanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbSoChoNgoi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDSKhachHang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
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

  
    
    
    private void ThemXe(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemXe
        if(KiemTra() == true ){
             JOptionPane.showMessageDialog(this, "Vui Lòng Nhập Đầy Đủ Thông Tin");
        }
        else{
            try {
                Connection cn = Model.opConnection();
                Xe xe =new Xe();
              
                String manv="SELECT SUBSTRING(MaXe,3 ,4)AS Dem FROM tblXe";
                PreparedStatement demnv = cn.prepareStatement(manv);
                ResultSet dem = demnv.executeQuery();
                int tam=0;
                if(dem != null){
                   while(dem.next()){
                       tam = Integer.parseInt(dem.getString("Dem"));
                    }
                    tam++;
                    if(tam < 10)
                    {
                         xe.setMaXe("XE000"+tam);
                    }
                    else if(tam < 100){
                         xe.setMaXe("XE00"+tam);
                    }
                    else if(tam < 1000){
                         xe.setMaXe("XE0"+tam);
                    }
                    else {
                         xe.setMaXe("XE"+tam);
                    }
                }
                else
                {     
                     xe.setMaXe("XE0001");


                }
                xe.setTenXe(txtTenXe.getText());
                xe.setMauXe(txtMauXe.getText());
                xe.setBienSoXe(txtBienSoXe.getText());
                xe.setNamSanXuat(txtNamSanXuat.getText());
                int scn=Integer.parseInt(cmbSoChoNgoi.getSelectedItem().toString());
                xe.setSoChoNgoi(scn);
                xe.setTrangThai((String)cmbTrangThai.getSelectedItem());
                Double gia=Double.parseDouble(txtGiaThue.getText());
                xe.setGiaThue(gia);
                xe.setAnhXe(person_image);
                String cmb = ( String) cmbHangXe.getSelectedItem();
                String sql="select * from tblHangXe where TenHang=N'"+cmb+"'";
                PreparedStatement mahang = cn.prepareStatement(sql);
                ResultSet rs = mahang.executeQuery();
                while(rs .next()){
                    xe.setMaHang(rs.getString("MaHang"));
                }
                XeDT dao = new XeDT();
                dao.ThemXe(xe);
                JOptionPane.showMessageDialog(this, "Xe Đã Được Lưu");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,"Error" +e.getMessage());
                JOptionPane.showMessageDialog(this, "Nhân Viên không Được Lưu");
            }
            loadData();
            Reset();
        }
    }//GEN-LAST:event_ThemXe

    private void SuaXe(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaXe
        if(KiemTra() == true ){
             JOptionPane.showMessageDialog(this, "Vui Lòng Nhập Đầy Đủ Thông Tin");
        }
        else{
            if(JOptionPane.showConfirmDialog(this, "Bạn có Chắc với thông tin đã nhập hay không ?") == JOptionPane.YES_OPTION){
                try {
                    Xe xe =new Xe();
                    xe.setMaXe(MaXe);
                    xe.setTenXe(txtTenXe.getText());
                    xe.setMauXe(txtMauXe.getText());
                    xe.setBienSoXe(txtBienSoXe.getText());
                    xe.setNamSanXuat(txtNamSanXuat.getText());
                    int scn=Integer.parseInt(cmbSoChoNgoi.getSelectedItem().toString());
                    xe.setSoChoNgoi(scn);
                    xe.setTrangThai((String)cmbTrangThai.getSelectedItem());
                    Double gia=Double.parseDouble(txtGiaThue.getText());
                    xe.setGiaThue(gia);
                    xe.setAnhXe(person_image);
                    Connection cn = Model.opConnection();
                    String cmb = ( String) cmbHangXe.getSelectedItem();
                    String sql="select * from tblHangXe where TenHang=N'"+cmb+"'";
                    PreparedStatement mahang = cn.prepareStatement(sql);
                    ResultSet rs = mahang.executeQuery();
                    while(rs .next()){
                        xe.setMaHang(rs.getString("MaHang"));
                    }
                    System.out.println( xe.getMaHang());
                    XeDT dao = new XeDT();
                    dao.SuaXe(xe);
                    JOptionPane.showMessageDialog(this, "Xe Đã Được Lưu");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Nhân Viên không Được Lưu");
                }
                loadData();
                Reset();
            }
         }
    }//GEN-LAST:event_SuaXe

    private void XoaXe(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaXe
        if(JOptionPane.showConfirmDialog(this, "Bạn có Muốn xóa nhân viên hay không ?") == JOptionPane.NO_OPTION){
            return;
            }
        try {
            XeDT dao =new XeDT();
            dao.XoaXe(MaXe);
            JOptionPane.showMessageDialog(this, "Nhân Viên Đã Được Xóa");
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nhân Viên không Được Lưu");
        }
        loadData();
        Reset();
    }//GEN-LAST:event_XoaXe

    private void txtTimKiemTimKiemKhachHang(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemTimKiemKhachHang
//        try {
//            NhanVienDT kh= new NhanVienDT();
//            String text= txtTimKiem.getText();
//            ResultSet rs = kh.TimKiemNhanVien(text);
//            model.setRowCount(0);
//            while(rs .next()){
//                String[] row = new String[]{
//                    rs .getString("MaKhachHang"),
//                    rs .getString("TenKhachHang"),
//                    rs .getString("DiaChi"),
//                    rs .getString("SoDienThoai"),
//                    rs .getString("CCCD"),
//                    rs .getString("TenCongTy"),
//                };
//                model.addRow(row);
//            }
//            model.fireTableDataChanged();
//            rs.close();
//        } catch (Exception e) {
//        }
    }//GEN-LAST:event_txtTimKiemTimKiemKhachHang

    private void btnThoaiToiFormNhanVien(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoaiToiFormNhanVien
        try {
            frmNhanVien nv=new frmNhanVien();
            this.setVisible(false);
            nv.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lỗi Không thể mở trang Nhân Viên");
        }
    }//GEN-LAST:event_btnThoaiToiFormNhanVien

    
    
    
    
    private void tblDSXeLayDuLieu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSXeLayDuLieu
        int index = tblDSXe.getSelectedRow();
        MaXe =tblDSXe.getValueAt(index,0).toString();
        txtTenXe.setText(tblDSXe.getValueAt(index,1).toString());
        txtMauXe.setText(tblDSXe.getValueAt(index,2).toString());
        cmbSoChoNgoi.setSelectedItem(tblDSXe.getValueAt(index,3).toString()); 
        txtGiaThue.setText(tblDSXe.getValueAt(index,4).toString());
        txtNamSanXuat.setText(tblDSXe.getValueAt(index,5).toString());
        txtBienSoXe.setText(tblDSXe.getValueAt(index,6).toString());
        
        try {
            String sql="select * from tblXe where MaXe=N'"+MaXe+"'";
            Connection cn = Model.opConnection();
            PreparedStatement ms = cn.prepareStatement(sql);
            ResultSet rs = ms.executeQuery();
         
             while(rs .next()){
               person_image = rs.getBytes("AnhXe");
         }
        } catch (Exception e) {
        }
        ImageIcon newimage = new ImageIcon(new ImageIcon(person_image).getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(newimage);
//        ChinhAnh  ca= new ChinhAnh();
//        bytesanganh =  ca.DuaImage(person_image);
//        person_image = anhsangbyte(bytesanganh,"jpg");
        String cmbhangxe=tblDSXe.getValueAt(index,8).toString();
        cmbHangXe.setSelectedItem(cmbhangxe);
         
//     try{
//         String cmb = tblDSXe.getValueAt(index,7).toString();
//         String sql="select * from tblChucVu where TenChucVu=N'"+cmb+"'";
//        PreparedStatement machucvu = cn.prepareStatement(sql);
//        ResultSet rs = machucvu.executeQuery();
//         int c=0;
//         while(rs .next()){
//           c = rs.getInt("MaChucVu");
//            c=c-1;
//              cmbHangXe.setSelectedIndex(c);
//         }
//     }catch (Exception e) {
//       }
    }//GEN-LAST:event_tblDSXeLayDuLieu

    
    
    
    
    private void btnHangXebtnToiFormChucVu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHangXebtnToiFormChucVu
        try {
            frmHangXe cv=new frmHangXe();
            this.setVisible(false);
            cv.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lỗi Không thể mở trang chức vụ");
        }
    }//GEN-LAST:event_btnHangXebtnToiFormChucVu

    private void loadAnh(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadAnh
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon newimage = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(newimage);
        try {
             File image = new File(filename);
             FileInputStream fis = new FileInputStream(image);
             ByteArrayOutputStream bos= new ByteArrayOutputStream();
             byte[] buf =new byte[1024];
             
             for( int readNum; ( readNum = fis.read(buf))!=-1; ){
            bos.write(buf,0,readNum); 
            }
            person_image = bos.toByteArray();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e );
           
        }

    }//GEN-LAST:event_loadAnh

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
             System.out.println("Loi");
             return null;
         }
        
        
    }
    public Image byteArrayToImage(byte[] byteArrayIn){
//        try
//        {
//            MemoryStream ms = new MemoryStream(byteArrayIn,0,byteArrayIn.Length);
//            ms.Write(byteArrayIn, 0, byteArrayIn.Length);
//            bytesanganh = Image.FromStream(ms,true);//Exception occurs here
//        }
//        catch(Exception e) { }
        return bytesanganh;
    }
        
    
    
    private void btnThem1ThemXe(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem1ThemXe
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThem1ThemXe


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCapNhatThongTinXe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHangXe;
    private javax.swing.JButton btnLoadAnh;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThem1;
    private javax.swing.JButton btnThoai;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cmbHangXe;
    private javax.swing.JComboBox<String> cmbSoChoNgoi;
    private javax.swing.JComboBox<String> cmbTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCCCD;
    private javax.swing.JLabel lblDSKhachHang;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblMaNhanVien;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblSoDienThoai;
    private javax.swing.JLabel lblTenNhanVien;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JTable tblDSXe;
    private javax.swing.JTextField txtBienSoXe;
    private javax.swing.JTextField txtGiaThue;
    private javax.swing.JTextField txtMauXe;
    private javax.swing.JTextField txtNamSanXuat;
    private javax.swing.JTextField txtTenXe;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

  
}
