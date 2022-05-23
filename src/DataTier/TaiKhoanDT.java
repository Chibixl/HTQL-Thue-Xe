/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTier;



// Thư viện
import java.sql.Connection; 
import java.sql.PreparedStatement;
import DataContext.TaiKhoan;
import DATABASE.Model;
import java.sql.ResultSet;





public class TaiKhoanDT {
    
    
    
    
    
    
    
    
    // Them Tài Khoản
     public boolean ThemTaiKhoan(TaiKhoan tk) {
        try {
            String sql="insert into tblTaiKhoan(TenTaiKhoan,MatKhau,MaNhanVien) values (?,?,?)";  
            Connection cn = Model.opConnection();
            PreparedStatement them = cn.prepareStatement(sql);
            them.setString(1, tk.getTenTaiKhoan());
            them.setString(2, tk.getMatKhau());
            them.setString(3, tk.getMaNhanVien());
            return them.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    
    }
     
     
     
     
     
     
        // Sữa Tài Khoản 
    public boolean SuaTaiKhoan(TaiKhoan tk) throws Exception{
         try {
            String sql="update tblTaiKhoan set TenTaiKhoan = ?, MatKhau = ? WHERE MaTaiKhoan =? ";     
            Connection cn = Model.opConnection();
            PreparedStatement them = cn.prepareStatement(sql);
            them.setInt(3, tk.getMaTaiKhoan());
            them.setString(1, tk.getTenTaiKhoan());
            them.setString(2, tk.getMatKhau());
            return them.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
      
    }
    
    
    
    
        // Xóa Tài Khoản
    public boolean XoaTaiKhoan(int MaTaiKhoan) throws Exception{
        try {
           String sql="delete from tblTaiKhoan where MaTaiKhoan =?";     
           Connection cn = Model.opConnection();
           PreparedStatement them = cn.prepareStatement(sql);
           them.setInt(1, MaTaiKhoan);  
           return them.executeUpdate() >0;
           } catch (Exception e) {
                 return false;
           }
      
    }
   public ResultSet KiemTraTaiKhoan(String tk) {
        try {
           String sql="select * from tblTaiKhoan where TenTaiKhoan ='"+tk+"'";     
           Connection cn = Model.opConnection();
           PreparedStatement kt = cn.prepareStatement(sql);
           ResultSet rs = kt.executeQuery();
           return rs;
           } catch (Exception e) {
                 return null;
           }
      
    }
}
