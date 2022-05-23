
package DataTier;
import DATABASE.Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import DataContext.ChucVu;
import java.sql.ResultSet;

public class ChucVuDT {
    Connection cn = Model.opConnection();
    public boolean ThemChucVu(ChucVu cv) {
        try {
            String sql="insert into tblChucVu(TenChucVu) values (?)";  
            PreparedStatement them = cn.prepareStatement(sql);
            them.setString(1, cv.getTenChucVu());
            return them.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean SuaChucVu(ChucVu cv) throws Exception{
         try {
            String sql="update tblChucVu set TenChucVu = ?  WHERE MaChucVu = ?";     
            PreparedStatement sua = cn.prepareStatement(sql);
            sua.setInt(2, cv.getMaChucVu());
            sua.setString(1, cv.getTenChucVu());
            return sua.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
      
    }
    
    
    public boolean XoaChucVu(int MaChucVu) throws Exception{
        try {
           String sql="delete from tblChucVu where MaChucVu =?";     
           PreparedStatement xoa = cn.prepareStatement(sql);
           xoa.setInt(1, MaChucVu);  
           return xoa.executeUpdate() >0;
           } catch (Exception e) {
                 return false;
           }
      
    }
    public ResultSet TimKiemChucVu(String text) throws Exception{
        try {
            String sql ="select * from tblChucVu Where TenChucVu like N'%" +text+"%'";  
            PreparedStatement TimKiem = cn.prepareStatement(sql);
            ResultSet rs = TimKiem.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
    }
    public ResultSet LoadDSChucVu(){
         try {
            String sql ="select * from tblChucVu";  
            PreparedStatement loadds = cn.prepareStatement(sql);
            ResultSet rs = loadds.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
    }
}
