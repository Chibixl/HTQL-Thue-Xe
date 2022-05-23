package Form;

import DATABASE.Model;
import DataContext.HangXe;
import DataTier.HangXeDT;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmHangXe extends javax.swing.JFrame {
    DefaultTableModel model;
    String MaHang="";

    
    public frmHangXe() {
        initComponents();
        setTable();
        loadData();
        reset();
        setquyen(false);
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
    private void reset(){
        txtTenHang.setText("");
    }
    private void setTable(){
           model =new DefaultTableModel();
           model.setColumnIdentifiers(new String[]{"Mã Hãng","Tên Hãng"});
           tblHangXe.setModel(model);

       }

    private void loadData(){
            try {
                String sql ="select * from tblHangXe";
                Connection cn = Model.opConnection();
                PreparedStatement cv =cn.prepareStatement(sql);
                ResultSet rs = cv.executeQuery();
                model.setRowCount(0);
                while(rs.next()){
                    String[] row = new String[]{
                        rs.getString("MaHang"),
                        rs.getString("TenHang"),

                    };
                    model.addRow(row);    
                }
                model.fireTableDataChanged();
                rs.close();
                cv.close();
                cn.close();
            } catch (Exception e) {
                 JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblSoDienThoai = new javax.swing.JLabel();
        txtTenHang = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        lblTimKiem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHangXe = new javax.swing.JTable();
        btnThoat = new javax.swing.JButton();
        btnThem1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(189, 215, 238));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hãng Xe");

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

        lblSoDienThoai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSoDienThoai.setText("Tên Hãng");

        txtTenHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemHangXe(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuaChucVu(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaChucVu(evt);
            }
        });

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        lblTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTimKiem.setText("Tìm Kiếm");

        tblHangXe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblHangXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LayData(evt);
            }
        });
        jScrollPane1.setViewportView(tblHangXe);

        btnThoat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToifrmCNNV(evt);
            }
        });

        btnThem1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(btnThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(lblSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(226, 226, 226)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(226, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(397, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(232, 232, 232)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(54, Short.MAX_VALUE)))
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

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
       try {
            HangXeDT cv= new HangXeDT();
            String text= txtTimKiem.getText().toString();
            ResultSet rs = cv.TimKiemHangXe(text);
            model.setRowCount(0);
            while(rs.next()){
                String[] row = new String[]{
                    rs.getString("MaHang"),
                    rs.getString("TenHang"),
                };
                model.addRow(row);    
            }
            model.fireTableDataChanged();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy chức vụ bạn cần");
        }
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void ThemHangXe(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemHangXe

            if(txtTenHang.getText().equals(""))
            {
               JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin");
            }
            else{
                try {
                    Connection cn = Model.opConnection();
                    HangXe hx =new HangXe();
                    String manv="SELECT SUBSTRING(MaHang,3 ,4)AS Dem FROM tblHangXe";
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
                             hx.setMaHang("HX000"+tam);
                        }
                        else if(tam < 100){
                             hx.setMaHang("HX00"+tam);
                        }
                        else if(tam < 1000){
                             hx.setMaHang("HX0"+tam);
                        }
                        else {
                             hx.setMaHang("HX"+tam);
                        }
                    }
                    else
                    {     
                        hx.setMaHang("HX0001");
                
                    
                    }
                    hx.setTenHang(txtTenHang.getText());
                    HangXeDT dao =new HangXeDT();
                    dao.ThamHangXe(hx);
                    JOptionPane.showMessageDialog(this, "Thêm Hãng Xe Thành Công");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Không Thêm được Hãng Xe");
                }                                    
                    loadData();
                    reset();
                    setquyen(false);
            }
    }//GEN-LAST:event_ThemHangXe

    private void SuaChucVu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaChucVu
        try {
            HangXe hx =new HangXe();
            hx.setMaHang(MaHang);
            hx.setTenHang(txtTenHang.getText());
            HangXeDT dao =new HangXeDT();
            dao.SuaHangXe(hx);
            JOptionPane.showMessageDialog(this, "Đã sữa thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không sữa được chức vụ");
        }  
           loadData();
           reset();
           setquyen(false);
    }//GEN-LAST:event_SuaChucVu

    private void XoaChucVu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaChucVu
        try {
            HangXeDT dao =new HangXeDT();
            dao.XoaHangXe(MaHang);
            JOptionPane.showMessageDialog(this, "Xóa chức vụ thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nhân Viên không Được Lưu");
        }
        loadData();
        reset();
        setquyen(false);
    }//GEN-LAST:event_XoaChucVu

    private void ToifrmCNNV(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToifrmCNNV
        try {
            frmXe xe=new frmXe();
            this.setVisible(false);
            xe.setVisible(true);
        } catch (Exception ex) {
 
        }
    }//GEN-LAST:event_ToifrmCNNV

    private void LayData(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LayData
        try {
            int index = tblHangXe.getSelectedRow();
              MaHang= tblHangXe.getValueAt(index,0).toString().trim();
            txtTenHang.setText((tblHangXe.getValueAt(index,1).toString()));
        } catch (Exception e) {
              JOptionPane.showMessageDialog(this, "Không thấy được dữ liệu");
        }
        setquyen(true);
        
    }//GEN-LAST:event_LayData

    private void huy(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huy
        reset();
        setquyen(false);
    }//GEN-LAST:event_huy


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHangXe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThem1;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSoDienThoai;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JTable tblHangXe;
    private javax.swing.JTextField txtTenHang;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
