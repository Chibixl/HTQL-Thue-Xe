
package Form;

import DataTier.NhanVienDT;
import DATABASE.Model;
import DataContext.NhanVien;
import DataContext.TaiKhoan;
import DataTier.TaiKhoanDT;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class frmCapNhatNhanVien extends javax.swing.JFrame {
    
    DefaultTableModel model;
    Connection cn = Model.opConnection();
    String MaNhanVien;
    
    
    
    
    
    public frmCapNhatNhanVien() throws Exception {
        
        initComponents();
        loadCMB();
        Settable();
        loadData();
        Reset();
        setquyen(false);
    }
    
    
    
    
    
    
    
    
    // Đổ dữ liệu lên Combobox
    private void loadCMB(){
        try {
            String laydschucvu ="select TenChucVu from tblChucVu";
            PreparedStatement cv =cn.prepareStatement(laydschucvu);
            ResultSet rs = cv.executeQuery();
            cmbChucVu.removeAllItems();
            while(rs.next()){
                cmbChucVu.addItem(rs.getString("TenChucVu"));
            }
            rs.close();
            cv.close();
            cn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
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
    
    
    

    
    
    
    
    
    
    
        // gán giá trị ban đầu cho form
    public void Reset(){
       txtTenNhanVien.setText("");
       txtDiaChi.setText("");
       txtMatKhau.setText("");
       txtSDT.setText("");
       txtCCCD.setText("");
       txtTaiKhoan.setText("");
       rbtNam.setSelected(true);
       ((JTextField)jdtNgaySinh.getDateEditor().getUiComponent()).setText("");
       cmbChucVu.setSelectedIndex(1);
           
    }
    
    
    
    
    
    
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
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblMaNhanVien = new javax.swing.JLabel();
        lblSoDienThoai = new javax.swing.JLabel();
        txtTenNhanVien = new javax.swing.JTextField();
        txtCCCD = new javax.swing.JTextField();
        lblTenNhanVien = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        lblCCCD = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        lblDiaChi = new javax.swing.JLabel();
        lblMatKhau = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        btnThoai = new javax.swing.JButton();
        lblTimKiem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSNhanVien = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lblDSKhachHang = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();
        lblChucVu = new javax.swing.JLabel();
        btnchucvu = new javax.swing.JButton();
        cmbChucVu = new javax.swing.JComboBox<>();
        rbtNam = new javax.swing.JRadioButton();
        rbtNu = new javax.swing.JRadioButton();
        jdtNgaySinh = new com.toedter.calendar.JDateChooser();
        btnThem1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(189, 215, 238));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cập Nhật Thông Tin Nhân Viên");

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
        lblMaNhanVien.setText("Tên Nhân Viên");

        lblSoDienThoai.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblSoDienThoai.setText("CCCD/CMND");

        txtTenNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtCCCD.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        lblTenNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblTenNhanVien.setText("Địa Chỉ");

        txtDiaChi.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        lblCCCD.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblCCCD.setText("Tên Tài Khoản");

        txtTaiKhoan.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtSDT.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        lblDiaChi.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblDiaChi.setText("Số Điện Thoại");

        lblMatKhau.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblMatKhau.setText("Mật Khẩu");

        txtMatKhau.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        btnThem.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemThemNhanVien(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnSua.setText("Sủa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaSuaNhanVien(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaXoaNhanVien(evt);
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
                btnThoaiToiFormNhanVien(evt);
            }
        });

        lblTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
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
        tblDSNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSNhanVienLayDuLieu(evt);
            }
        });
        jScrollPane1.setViewportView(tblDSNhanVien);

        lblDSKhachHang.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblDSKhachHang.setText("Danh sách Nhân Viên");

        lblNgaySinh.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblNgaySinh.setText("Ngày Sinh");

        lblGioiTinh.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblGioiTinh.setText("Giới Tính");

        lblChucVu.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblChucVu.setText("Chức Vụ");

        btnchucvu.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnchucvu.setText("Thêm Chức Vụ");
        btnchucvu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToiFormChucVu(evt);
            }
        });

        cmbChucVu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonGroup1.add(rbtNam);
        rbtNam.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        rbtNam.setText("Nam");

        buttonGroup1.add(rbtNu);
        rbtNu.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        rbtNu.setText("Nữ");

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1098, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDSKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(lblMaNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jdtNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                    .addComponent(txtCCCD, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                    .addComponent(txtTenNhanVien))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblCCCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtDiaChi)
                                            .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(rbtNam)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbtNu, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMatKhau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMatKhau)
                                    .addComponent(txtSDT)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cmbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnchucvu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDiaChi))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSDT)))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMatKhau)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnchucvu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jdtNgaySinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtNam)
                            .addComponent(rbtNu))))
                .addGap(6, 6, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblDSKhachHang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    
    
    
    
    
    
    
    // sự kiện cho nút Thêm Nhân Viên và tài khoản
    private void btnThemThemNhanVien(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemThemNhanVien
        try {
            Connection cn = Model.opConnection();
            NhanVien nv =new NhanVien();
            String manv="SELECT SUBSTRING(MaNhanVien,3 ,4)AS Dem FROM tblNhanVien";
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
                     nv.setMaNhanVien("NV000"+tam);
                }
                else if(tam < 100){
                    nv.setMaNhanVien("NV00"+tam);
                }
                else if(tam < 1000){
                    nv.setMaNhanVien("NV0"+tam);
                }
                else {
                    nv.setMaNhanVien("NV"+tam);
                }
            }
            else
            {     
                nv.setMaNhanVien("NV0001");
                
                    
            }
          
            nv.setTenNhanVien(txtTenNhanVien.getText());
            nv.setDiaChi(txtDiaChi.getText());
            nv.setSoDienThoai(txtSDT.getText());
            nv.setCCCD(txtCCCD.getText());
            nv.setGioiTinh(rbtNam.isSelected()? "Nam":"Nữ");
            nv.setNgaySinh(((JTextField)jdtNgaySinh.getDateEditor().getUiComponent()).getText());
            String cmb = ( String) cmbChucVu.getSelectedItem();
            String sql="select * from tblChucVu where TenChucVu=N'"+cmb+"'";
            PreparedStatement machucvu = cn.prepareStatement(sql);
            ResultSet rs = machucvu.executeQuery();
            while(rs .next()){
                nv.setMaChucVu(rs.getInt("MaChucVu"));
            }
            NhanVienDT dao =new NhanVienDT();
            dao.ThemNhanVien(nv);
            TaiKhoan tk = new TaiKhoan();
            tk.setMaNhanVien(nv.getMaNhanVien());
            tk.setTenTaiKhoan(txtTaiKhoan.getText());
            tk.setMatKhau(txtMatKhau.getText());
            TaiKhoanDT tkdt= new TaiKhoanDT();
            tkdt.ThemTaiKhoan(tk);
            JOptionPane.showMessageDialog(this, "Nhân Viên Đã Được Lưu");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Error" +e.getMessage());
            JOptionPane.showMessageDialog(this, "Nhân Viên không Được Lưu");
        }
            loadData();
            Reset();
            setquyen(false);
    }//GEN-LAST:event_btnThemThemNhanVien

    
    
    
    
    
    
    
    
    
        // sự kiện cho nút Xóa Nhân Viên và tài khoản
    private void btnSuaSuaNhanVien(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaSuaNhanVien
        if(JOptionPane.showConfirmDialog(this, "Bạn có Chắc với thông tin đã nhập hay không ?") == JOptionPane.YES_OPTION){
            try {
                Connection cn = Model.opConnection();
                NhanVien nv =new NhanVien();
                nv.setMaNhanVien(MaNhanVien);
                System.out.println(nv.getMaNhanVien());
                nv.setTenNhanVien(txtTenNhanVien.getText());
                nv.setDiaChi(txtDiaChi.getText());
                nv.setSoDienThoai(txtSDT.getText());
                nv.setCCCD(txtCCCD.getText());
                nv.setGioiTinh(rbtNam.isSelected()? "Nam":"Nữ");
                nv.setNgaySinh(((JTextField)jdtNgaySinh.getDateEditor().getUiComponent()).getText());
                String cmb = ( String) cmbChucVu.getSelectedItem();
                String sql="select * from tblChucVu where TenChucVu=N'"+cmb+"'";
                PreparedStatement machucvu = cn.prepareStatement(sql);
                ResultSet rs = machucvu.executeQuery();
                   while(rs.next()){
                       nv.setMaChucVu(rs.getInt("MaChucVu"));
                   }
                System.out.println(nv.getNgaySinh());
                NhanVienDT dao =new NhanVienDT();
                dao.SuaNhanVien(nv);
                TaiKhoan tk = new TaiKhoan();
                tk.setMaNhanVien(MaNhanVien);
                String timMaTaiKhoan="select * from tblTaiKhoan where MaNhanVien=N'"+MaNhanVien+"'";
                PreparedStatement a = cn.prepareStatement(timMaTaiKhoan);
                ResultSet b = a.executeQuery();
                while(b.next()){
                    tk.setMaTaiKhoan(b.getInt("MaTaiKhoan"));
                }
                tk.setTenTaiKhoan(txtTaiKhoan.getText());
                tk.setMatKhau(txtMatKhau.getText());
                TaiKhoanDT tkdt= new TaiKhoanDT();
                tkdt.SuaTaiKhoan(tk);
                JOptionPane.showMessageDialog(this, "Nhân Viên Đã Được Cập Nhật");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Nhân Viên không Được Lưu");
            }
                loadData();
                Reset();
                setquyen(false);
        }
    }//GEN-LAST:event_btnSuaSuaNhanVien
    
    
    
    
    
    
    
        // sự kiện cho nút xóa Nhân Viên
    private void btnXoaXoaNhanVien(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaXoaNhanVien
        if(JOptionPane.showConfirmDialog(this, "Bạn có Muốn xóa nhân viên hay không ?") == JOptionPane.NO_OPTION){
            return;
        }
        try {
            Connection cn = Model.opConnection();
            String timMaTaiKhoan="select * from tblTaiKhoan where MaNhanVien=N'"+MaNhanVien+"'";
            PreparedStatement a = cn.prepareStatement(timMaTaiKhoan);
            ResultSet b = a.executeQuery();
            int tam=0;
            while(b.next()){
                tam = b.getInt("MaTaiKhoan");
            }
            TaiKhoanDT tkdt= new TaiKhoanDT();
            tkdt.XoaTaiKhoan(tam);
            NhanVienDT dao =new NhanVienDT();
            dao.XoaNhanVien(MaNhanVien);
            JOptionPane.showMessageDialog(this, "Nhân Viên Đã Được Xóa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nhân Viên không xóa được");
        }
            loadData();
            Reset();
            setquyen(false);
    }//GEN-LAST:event_btnXoaXoaNhanVien

    
    
    
    
    
    
    
    
        // sự kiện cho tìm kiếm khách hàng
    private void TimKiemKhachHang(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TimKiemKhachHang
        try {
            NhanVienDT nv= new NhanVienDT();
            ResultSet rs = nv.TimKiemNhanVien(txtTimKiem.getText());
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

    }//GEN-LAST:event_TimKiemKhachHang

    private void btnThoaiToiFormNhanVien(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoaiToiFormNhanVien
        try {
            frmNhanVien nv=new frmNhanVien();
            this.setVisible(false);
            nv.setVisible(true);
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(this, "Lỗi Không thể mở trang Nhân Viên");
        }
    }//GEN-LAST:event_btnThoaiToiFormNhanVien

    
    
    
    
    
    
    
    
    
    
        // sự kiện lấy dữ liệu từ bảng đưa vào chỗ trống
    private void tblDSNhanVienLayDuLieu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSNhanVienLayDuLieu
        Connection cn = Model.opConnection();
        int index = tblDSNhanVien.getSelectedRow();
        MaNhanVien =tblDSNhanVien.getValueAt(index,0).toString();
        txtTenNhanVien.setText(tblDSNhanVien.getValueAt(index,1).toString());
        txtDiaChi.setText(tblDSNhanVien.getValueAt(index,2).toString());
        txtSDT.setText(tblDSNhanVien.getValueAt(index,3).toString());
        txtCCCD.setText(tblDSNhanVien.getValueAt(index,4).toString());
        if((tblDSNhanVien.getValueAt(index,5).toString().trim().length())==3){
                rbtNam.setSelected(true);      
        }
        else
        {
              rbtNu.setSelected(true);
        }
        ((JTextField)jdtNgaySinh.getDateEditor().getUiComponent()).setText(tblDSNhanVien.getValueAt(index,6).toString().trim());
        try{
            String cmb = tblDSNhanVien.getValueAt(index,7).toString();
            String sql="select * from tblChucVu where TenChucVu=N'"+cmb+"'";
            PreparedStatement machucvu = cn.prepareStatement(sql);
            ResultSet rs = machucvu.executeQuery();
            int c=0;
               while(rs .next()){
                   c = rs.getInt("MaChucVu");
                   c=c-1;
                   cmbChucVu.setSelectedIndex(c);
        }
        }catch (Exception e) {
        }
        try{
            String manv = tblDSNhanVien.getValueAt(index,0).toString();
            String sql="select * from tblTaiKhoan where MaNhanVien=N'"+manv+"'";
            PreparedStatement tam = cn.prepareStatement(sql);
            ResultSet rs = tam.executeQuery();
            while(rs .next()){
                txtTaiKhoan.setText(rs.getString("TenTaiKhoan"));
                txtMatKhau.setText(rs.getString("MatKhau"));
                   
        }
        }catch (Exception e) {
        }
        setquyen(true);
    }//GEN-LAST:event_tblDSNhanVienLayDuLieu

    private void btnToiFormChucVu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToiFormChucVu
        try {
            frmChucVu cv=new frmChucVu();
            this.setVisible(false);
            cv.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lỗi Không thể mở trang chức vụ");
        }
    }//GEN-LAST:event_btnToiFormChucVu

    private void huy(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huy
       Reset();
       setquyen(false);
    }//GEN-LAST:event_huy

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
            java.util.logging.Logger.getLogger(frmCapNhatNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCapNhatNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCapNhatNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCapNhatNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmCapNhatNhanVien().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(frmCapNhatNhanVien.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnchucvu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbChucVu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private com.toedter.calendar.JDateChooser jdtNgaySinh;
    private javax.swing.JLabel lblCCCD;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblDSKhachHang;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblMaNhanVien;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblSoDienThoai;
    private javax.swing.JLabel lblTenNhanVien;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JRadioButton rbtNam;
    private javax.swing.JRadioButton rbtNu;
    private javax.swing.JTable tblDSNhanVien;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTaiKhoan;
    private javax.swing.JTextField txtTenNhanVien;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
