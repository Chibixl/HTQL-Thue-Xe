
package Form;

import DATABASE.Model;
import DataTier.XeDT;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;


public class frmDatXe1 extends javax.swing.JFrame {
    DefaultTableModel model;
    private JTable a =new JTable();
    private int tam=0;
    public int index= 0 ;
    private byte[] anh;
    private String tenxe;
    private String MaXe;
    private String name;
    JFrame pnlmain;
    JPanel pnldatxe;
    JLabel lbldatxe;
    JLabel lblTenXe;
    int x=90, y=0,kcx=270,kcy=220,k=0 ;
    
    
    public frmDatXe1() {
        initComponents();
        Settable();
        tam =1;
        loadCMBHangXe();
         x=90; y=0;kcx=270;kcy=220;k=0 ;
        cmbHangXe.addItem("Chọn Hãng");
        cmbHangXe.setSelectedItem("Chọn Hãng");KhoiTaoSoHang();
    }
    private void loadcmbhangxe(){
        
    }
    int dem;
    public void KhoiTaoSoHang(){
        try {
            Connection cn = Model.opConnection();
            String sql ="Select COUNT(MaXe)AS Tam from tblXe Where TinhTrang=N'Đang Rảnh'";
            PreparedStatement loadds = cn.prepareStatement(sql);
            ResultSet rs = loadds.executeQuery();
            int vitri=0;
            System.out.println(index);
            while(rs.next())
            {
                dem=rs.getInt("Tam");
                
            }
         
            vitri=0;
            Lay8xe(vitri,3,3); 
                
        } catch (Exception e) {
            System.out.println("Lỗi");
        } 
    }
    private int  Lay8xe(int vitri, int dem,int tam){
            for (int j=0;j<tam;j++)
            {
                if(k<dem) 
                {
                    pnldatxe = new JPanel();
                    pnldatxe.setLocation(x,y);
                    pnldatxe.setSize(250,200);
                    pnldatxe.setBackground(Color.BLUE);
                    pnlhi.add(pnldatxe);
                    lbldatxe=new JLabel();
                    lbldatxe.setLocation(0,0);
                    lbldatxe.setSize(150,200);
                    MaXe =a.getValueAt(vitri,0).toString();
                    lbldatxe.setName(MaXe);
                    LayAnh( MaXe);
                    String name =lbldatxe.getName();
                    ImageIcon newimage = new ImageIcon(new ImageIcon(anh).getImage().getScaledInstance(250, 150,Image.SCALE_SMOOTH));
                    lbldatxe.setIcon(newimage);
                    lbldatxe.addMouseListener(new java.awt.event.MouseAdapter(){

                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            hello(evt,name);
                    }
                    });
                    pnldatxe.add(lbldatxe);
                    lblTenXe=new JLabel();
                    lblTenXe.setLocation(0,0);
                    lblTenXe.setSize(150,200);
                    tenxe = a.getValueAt(vitri, 1).toString();
                    lblTenXe.setText(tenxe);
                    pnldatxe.add(lblTenXe);
                    x+=kcx;
                    vitri=vitri+1;
                    k+=1;
                }
               
            }
             return vitri;
    }
    private byte[] LayAnh(String MaXe){
        try{
            String sql="select * from tblXe where MaXe=N'"+MaXe+"'";
            Connection cn = Model.opConnection();
            PreparedStatement machucvu = cn.prepareStatement(sql);
            ResultSet rs = machucvu.executeQuery();

             while(rs .next()){
               anh = rs.getBytes("AnhXe");
            }
            return anh;
        }
         catch (Exception e) {
            return null;
        }
    }
    
    
    public void Settable(){
        model =new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Mã Xe","Tên Xe","Màu Xe","Số Chỗ Ngồi","Gía Thuê"
                + "","Năm Sản Xuất","Biển Số Xe","Trạng Thái","Tên Hãng"});
        a.setModel(model);
        loadData();
            
    }
    public String TenHang="";
     public void loadData() {
        try {
            XeDT nv= new XeDT();
            String sql ="select MaXe,TenXe,MauXe,BienSoXe,GiaThue,NamSanXuat,SoChoNgoi,TinhTrang,TenHang "
                    + "from tblHangXe H,tblXe X WHERE H.MaHang=X.MaHang and TinhTrang = N'Đang Rảnh'";
//                    + "and TenHang like N'"+TenHang+"'";
            
            Connection cn = Model.opConnection();
            PreparedStatement kh =cn.prepareStatement(sql);
            ResultSet rs = kh.executeQuery();
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
     private void hello(java.awt.event.MouseEvent evt,String lbl) {  
        
        
        frmThongTinXe ttxe=new frmThongTinXe();
        ttxe.MaXe=lbl;
        this.setVisible(false);
        ttxe.setVisible(true);
        ttxe.loadData();
        
        
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHienThi = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        lblTimKiem = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        lblTenNhanVien = new javax.swing.JLabel();
        cmbHangXe = new javax.swing.JComboBox<>();
        lblMatKhau = new javax.swing.JLabel();
        cmbSoChoNgoi = new javax.swing.JComboBox<>();
        lblgiohang = new javax.swing.JLabel();
        lblMatKhau1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        lblMatKhau2 = new javax.swing.JLabel();
        pnlhi = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlHienThi.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(189, 215, 238));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Đặt Xe");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );

        jButton2.setBackground(new java.awt.Color(189, 215, 238));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Đặt Xe");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(189, 215, 238));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setText("Đặt Xe");
        jButton4.setAlignmentY(0.0F);
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);

        jButton5.setBackground(new java.awt.Color(189, 215, 238));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.setText("Đặt Xe");
        jButton5.setAlignmentY(0.0F);
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);

        jButton6.setBackground(new java.awt.Color(189, 215, 238));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton6.setText("Đặt Xe");
        jButton6.setAlignmentY(0.0F);
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);

        jButton7.setBackground(new java.awt.Color(189, 215, 238));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton7.setText("Đặt Xe");
        jButton7.setAlignmentY(0.0F);
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);

        jButton8.setBackground(new java.awt.Color(189, 215, 238));
        jButton8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton8.setText("Đặt Xe");
        jButton8.setAlignmentY(0.0F);
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);

        lblTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblTimKiem.setText("Tìm Kiếm");

        txtTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemTimKiemKhachHang(evt);
            }
        });

        lblTenNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblTenNhanVien.setText("Hãng Xe");

        cmbHangXe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbHangXe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblMatKhau.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblMatKhau.setText("Số Chỗ Ngồi");

        cmbSoChoNgoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbSoChoNgoi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblgiohang.setIcon(new javax.swing.ImageIcon("D:\\Đồ án Cơ Sở\\Image\\images.png")); // NOI18N

        lblMatKhau1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblMatKhau1.setText("Ngày Nhận");

        lblMatKhau2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblMatKhau2.setText("Ngày Trả");

        javax.swing.GroupLayout pnlhiLayout = new javax.swing.GroupLayout(pnlhi);
        pnlhi.setLayout(pnlhiLayout);
        pnlhiLayout.setHorizontalGroup(
            pnlhiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1186, Short.MAX_VALUE)
        );
        pnlhiLayout.setVerticalGroup(
            pnlhiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlHienThiLayout = new javax.swing.GroupLayout(pnlHienThi);
        pnlHienThi.setLayout(pnlHienThiLayout);
        pnlHienThiLayout.setHorizontalGroup(
            pnlHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlHienThiLayout.createSequentialGroup()
                .addGroup(pnlHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlHienThiLayout.createSequentialGroup()
                        .addContainerGap(77, Short.MAX_VALUE)
                        .addComponent(lblTimKiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlHienThiLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblgiohang, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHienThiLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))
                    .addGroup(pnlHienThiLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbHangXe, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSoChoNgoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMatKhau1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMatKhau2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(pnlHienThiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHienThiLayout.setVerticalGroup(
            pnlHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHienThiLayout.createSequentialGroup()
                .addGroup(pnlHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlHienThiLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbHangXe, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbSoChoNgoi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMatKhau1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMatKhau2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(pnlhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(pnlHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHienThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHienThiLayout.createSequentialGroup()
                        .addComponent(lblgiohang)
                        .addGap(44, 44, 44))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHienThi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHienThi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        pnlhi.setVisible(false);
        pnlhi.removeAll();
        pnlhi.setVisible(true);
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void txtTimKiemTimKiemKhachHang(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemTimKiemKhachHang
       
    }//GEN-LAST:event_txtTimKiemTimKiemKhachHang

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDatXe1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbHangXe;
    private javax.swing.JComboBox<String> cmbSoChoNgoi;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblMatKhau1;
    private javax.swing.JLabel lblMatKhau2;
    private javax.swing.JLabel lblTenNhanVien;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JLabel lblgiohang;
    private javax.swing.JPanel pnlHienThi;
    private javax.swing.JPanel pnlhi;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
