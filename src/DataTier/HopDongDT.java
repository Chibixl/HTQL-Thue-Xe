/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTier;

import DATABASE.Model;
import DataContext.HopDong;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author win10
 */
public class HopDongDT {
     Connection cn = Model.opConnection();
    public boolean ThemHopDong(HopDong hd) {
        try {
            String sql="insert into tblHopDong(MaHopDong,TongTien,NgayLap,MaNhanVien,MaKhachHang) values (?,?,?,?,?)";  
            PreparedStatement them = cn.prepareStatement(sql);
            them.setString(1, hd.getMaHopDong());
            them.setDouble(2, hd.getTongTien());
            them.setDate(3, hd.getNgayLap());
            them.setString(4, hd.getMaNhanVien());
            them.setString(5, hd.getMaKhachHang());
            return them.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    public ResultSet DanhSachHopDong() {
        try {
            String a ="select MaHopDong,TongTien,NgayLap,TenNhanVien,TenKhachHang "
                    + " from tblNhanVien N,tblHopDong H,tblKhachHang K"
                    + " WHERE K.MaKhachHang = H.MaKhachHang AND N.MaNhanVien =H.MaNhanVien";
            PreparedStatement kh =cn.prepareStatement(a);
            ResultSet rs = kh.executeQuery();
            System.out.println("oke");
        return rs;
        } catch (Exception e) {
            System.out.println("aaaaaa");
            return null;
        }
    }
    public ResultSet DanhSachctHopDong(String mhd) {
        try {
            String a ="select H.MaHopDong,TenXe,NgayGiao,NgayTra"
                    + " from tblHopDong H,tblXe x,tblChiTietHopDong C"
                    + " WHERE H.MaHopDong=C.MaHopDong AND X.MaXe =c.MaXe and H.MaHopDong='"+mhd+"'";
            PreparedStatement kh =cn.prepareStatement(a);
            ResultSet rs = kh.executeQuery();
            System.out.println("oke");
        return rs;
        } catch (Exception e) {
            System.out.println("aaaaaa");
            return null;
        }
    }
}
