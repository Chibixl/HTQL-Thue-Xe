
package DataTier;

import DATABASE.Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import DataContext.KhachHang;
import java.sql.ResultSet;


public class KhachHangDT {
    
    
    
    
     public boolean ThemKhachHang(KhachHang kh){
         try {
             String sql="insert into tblKhachHang(MaKhachHang,TenKhachHang,DiaChi,SoDienThoai,CCCD,TenCongTy) values (?,?,?,?,?,?)";  
            Connection cn = Model.opConnection();
            PreparedStatement them = cn.prepareStatement(sql);
            them.setString(1, kh.getMaKhachHang());
            them.setString(2, kh.getTenKhachHang());
            them.setString(3, kh.getDiaChi());
            them.setString(4, kh.getSoDienThoai());
            them.setString(5, kh.getCCCD());
            them.setString(6, kh.getTenCongTy());
            return them.executeUpdate() >0;
         } catch (Exception e) {
             return false;
         }
    }
     
     
     
     
     
    public boolean SuaKhachHang(KhachHang kh) throws Exception{
        try {
            String sql="update tblKhachHang set TenKhachHang = ?, DiaChi = ?,"
                    + " SoDienThoai = ?, CCCD = ?, TenCongTy = ? "
                    + "  WHERE MaKhachHang = ?";     
            Connection cn = Model.opConnection();
            PreparedStatement them = cn.prepareStatement(sql);
            them.setString(6, kh.getMaKhachHang());
            them.setString(1, kh.getTenKhachHang());
            them.setString(2, kh.getDiaChi());
            them.setString(3, kh.getSoDienThoai());
            them.setString(4, kh.getCCCD());
            them.setString(5, kh.getTenCongTy());
        return them.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
       
    }
    
    
    
    
    
    public boolean XoaKhachHang(String MaKhachHang) throws Exception{
        try {
            String sql="delete from tblKhachHang where MaKhachHang =?";     
            Connection cn = Model.opConnection();
            PreparedStatement xoa = cn.prepareStatement(sql);
            xoa.setString(1, MaKhachHang);  
        return xoa.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    
    
    
    
    
    public ResultSet TimKiemKhachHang(String text) throws Exception{
        try {
            String sql ="select * from tblKhachHang Where MaKhachHang like N'%" + text+"%' or "
                    + "  TenKhachHang like N'%" + text+"%' or TenCongTy like N'%" + text+"%' or"
                    + "  DiaChi like N'%" + text+"%' or CCCD like N'%" + text+"%' or"
                    + "  SoDienThoai like N'%" + text+"%'  ";  
            Connection cn = Model.opConnection();
            PreparedStatement TimKiem = cn.prepareStatement(sql);
            ResultSet rs = TimKiem.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }   
    }   
    
    
    
    
    
    public ResultSet DanhSachKhachHang() throws Exception{
        try {
            String sql ="select MaKhachHang,TenKhachHang,DiaChi,SoDienThoai,CCCD,TenCongTy from tblKhachHang";
            Connection cn = Model.opConnection();
            PreparedStatement kh =cn.prepareStatement(sql);
            ResultSet rs = kh.executeQuery();
        return rs;
        } catch (Exception e) {
            return null;
        }
        
    }
}
