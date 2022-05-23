
package DataTier;

import DATABASE.Model;
import DataContext.Xe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class XeDT {
    
    
    
    
    
    
    public boolean ThemXe(Xe xe) {
        try {
            String sql="insert into tblXe(MaXe,TenXe,MauXe,SoChoNgoi,GiaThue,NamSanXuat,BienSoXe,AnhXe,TinhTrang,MaHang) values (?,?,?,?,?,?,?,?,?,?)";  
            Connection cn = Model.opConnection();
            PreparedStatement them = cn.prepareStatement(sql);
            them.setString(1, xe.getMaXe());
            them.setString(2, xe.getTenXe());
            them.setString(3, xe.getMauXe());
            them.setInt(4, xe.getSoChoNgoi());
            them.setDouble(5, xe.getGiaThue());
            them.setString(6,xe.getNamSanXuat());
            them.setString(7, xe.getBienSoXe());
            them.setBytes(8, xe.getAnhXe());
            them.setString(9, xe.getTrangThai());
            them.setString(10,xe.getMaHang());
            them.executeUpdate();
            cn.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Lỗi");
            return false;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public boolean SuaXe(Xe xe) {
        try {
            String sql="update tblXe set TenXe = ?, MauXe = ?,"
              + " SoChoNgoi = ?, GiaThue = ?, NamSanXuat = ?,"
              + " BienSoXe=?, AnhXe = ?,TinhTrang =?, MaHang=?"
              + "  WHERE MaXe = ?";     
            Connection cn = Model.opConnection();
            PreparedStatement them = cn.prepareStatement(sql);
            them.setString(10, xe.getMaXe());
            them.setString(1, xe.getTenXe());
            them.setString(2, xe.getMauXe());
            them.setInt(3, xe.getSoChoNgoi());
            them.setDouble(4, xe.getGiaThue());
            them.setString(5,xe.getNamSanXuat());
            them.setString(6, xe.getBienSoXe());
            them.setBytes(7, xe.getAnhXe());
            them.setString(8, xe.getTrangThai());
            them.setString(9,xe.getMaHang());
            
            them.executeUpdate();
            System.out.println("oke");
            cn.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Lỗi");
            return false;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public boolean XoaXe(String MaXe) {
        try {
            String sql="delete from tblXe where MaXe =?";     
            Connection cn = Model.opConnection();
            PreparedStatement them = cn.prepareStatement(sql);
            them.setString(1, MaXe);  
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
            Connection cn = Model.opConnection();
            PreparedStatement TimKiem = cn.prepareStatement(sql);
            ResultSet rs = TimKiem.executeQuery();
            return rs;
        } catch (Exception e) {
            return null;
        }
            
    }

    public ResultSet DanhSachNhanVien() {
        try {
            String sql ="select MaXe,TenXe,MauXe,BienSoXe,GiaThue,NamSanXuat,SoChoNgoi,TinhTrang,TenHang "
                    + "from tblHangXe H,tblXe X WHERE H.MaHang=X.MaHang";
            
            Connection cn = Model.opConnection();
            PreparedStatement kh =cn.prepareStatement(sql);
            ResultSet rs = kh.executeQuery();
        return rs;
        } catch (Exception e) {
            return null;
        }
        
    }
    
    
}
