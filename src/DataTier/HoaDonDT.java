/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTier;

import DATABASE.Model;
import DataContext.HoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author win10
 */
public class HoaDonDT {
     Connection cn = Model.opConnection();
    public boolean ThemHoaDon(HoaDon hd) {
        try {
            String sql="insert into tblHoaDon(MaHoaDon,TongTien,NgayLap,MaHopDong) values (?,?,?,?)";  
            PreparedStatement them = cn.prepareStatement(sql);
            them.setString(1, hd.getMaHoaDon());
            them.setDouble(2, hd.getTongTien());
            them.setDate(3, hd.getNgayLap());
            them.setString(4, hd.getMaHopDong());
            return them.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
}
