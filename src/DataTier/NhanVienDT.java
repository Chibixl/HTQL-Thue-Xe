
package DataTier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import DataContext.NhanVien;
import DATABASE.Model;
import java.sql.ResultSet;

public class NhanVienDT {
    
     Connection cn = Model.opConnection();
    
    
    
    
    public boolean ThemNhanVien(NhanVien nv) {
        try {
            String sql="insert into tblNhanVien(MaNhanVien,TenNhanVien,DiaChi"
              + " ,SoDienThoai,CCCD,GioiTinh,NgaySinh,MaChucVu) values (?,?,?,?,?,?,?,?)";  
            PreparedStatement them = cn.prepareStatement(sql);
            them.setString(1, nv.getMaNhanVien());
            them.setString(2, nv.getTenNhanVien());
            them.setString(3, nv.getDiaChi());
            them.setString(4, nv.getSoDienThoai());
            them.setString(5, nv.getCCCD());
            them.setString(6, nv.getGioiTinh());
            them.setString(7,nv.getNgaySinh());
            them.setInt(8, nv.getMaChucVu());
            return them.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public boolean SuaNhanVien(NhanVien nv) {
        try {
            String sql="update tblNhanVien set TenNhanVien = ?, DiaChi = ?,"
              + " SoDienThoai = ?, CCCD = ?, GioiTinh = ?,"
              + " NgaySinh=?, MaChucVu = ? "
              + "  WHERE MaNhanVien = ?";     
            PreparedStatement them = cn.prepareStatement(sql);
            them.setString(8, nv.getMaNhanVien());
            them.setString(1, nv.getTenNhanVien());
            them.setString(2, nv.getDiaChi());
            them.setString(3, nv.getSoDienThoai());
            them.setString(4, nv.getCCCD());
            them.setString(5, nv.getGioiTinh());
            them.setString(6,nv.getNgaySinh());
            them.setInt(7, nv.getMaChucVu());
            return them.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public boolean XoaNhanVien(String MaNhanVien) {
        try {
              String sql="delete from tblNhanVien where MaNhanVien =?";     
        PreparedStatement them = cn.prepareStatement(sql);
        them.setString(1, MaNhanVien);  
        return them.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }   
    }
    
    
    
    
    
    
    
    
    
    
    public ResultSet TimKiemNhanVien(String text) {
        try {
            String sql ="select MaNhanVien,TenNhanVien,DiaChi,SoDienThoai,CCCD,GioiTinh,NgaySinh,TenChucVu from tblNhanVien nv, tblChucVu cv Where"
                    + " nv.MaChucVu = cv.MaChucVu and (MaNhanVien like N'%" +text+"%' or "
                    + "  TenNhanVien like N'%" + text+"%' or DiaChi like N'%" + text+"%' or"
                    + "  SoDienThoai like N'%" + text+"%' or CCCD like N'%" + text+"%' or"
                    + "  NgaySinh like N'%" + text+"%' or GioiTinh like N'%" + text+"%')";  
            PreparedStatement TimKiem = cn.prepareStatement(sql);
            ResultSet rs = TimKiem.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
            
    }
    
    
    
    
    
    
    
    
    
    public ResultSet DanhSachNhanVien() {
        try {
            String sql ="select MaNhanVien,TenNhanVien,DiaChi,SoDienThoai,CCCD,GioiTinh,NgaySinh,TenChucVu from tblNhanVien N,tblChucVu C WHERE"
                    + "  C.MaChucVu=N.MaChucVu";
            PreparedStatement kh =cn.prepareStatement(sql);
            ResultSet rs = kh.executeQuery();
        return rs;
        } catch (Exception e) {
            return null;
        }
        
    }
     
     
     
    
}
