package DataTier;

import DATABASE.Model;
import DataContext.HangXe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HangXeDT {
     public boolean ThamHangXe(HangXe hx) {
        try {
            String sql="insert into tblHangXe (MaHang,TenHang) values (?,?)";  
            Connection cn = Model.opConnection();
            PreparedStatement them = cn.prepareStatement(sql);
            them.setString(1, hx.getMaHang());
            them.setString(2, hx.getTenHang());
            return them.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    
    }
    public boolean SuaHangXe(HangXe hx) throws Exception{
         try {
            String sql="update tblHangXe set TenHang = ?  WHERE MaHang = ?";     
             Connection cn = Model.opConnection();
            PreparedStatement them = cn.prepareStatement(sql);
            them.setString(2, hx.getMaHang());
            them.setString(1, hx.getTenHang());
            return them.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
      
    }
    public boolean XoaHangXe(String MaHang) throws Exception{
        try {
           String sql="delete from tblHangXe where MaHang =?";     
           Connection cn = Model.opConnection();
           PreparedStatement them = cn.prepareStatement(sql);
           them.setString(1, MaHang);  
           return them.executeUpdate() >0;
           } catch (Exception e) {
                 return false;
           }
      
    }
    public ResultSet TimKiemHangXe(String text) throws Exception{
        try {
          
            String sql ="select * from tblHangXe Where MaHang like N'%" + text+"%' or "
                    + "  TenHang like N'%" + text+"%'  ";  
            Connection cn = Model.opConnection();
            PreparedStatement TimKiem = cn.prepareStatement(sql);
            ResultSet rs = TimKiem.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
    }
    public ResultSet LoadHangXe(){
         try {
          
            String sql ="select * from tblChucVu ";  
            Connection cn = Model.opConnection();
            PreparedStatement loadds = cn.prepareStatement(sql);
            ResultSet rs = loadds.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
    }

}