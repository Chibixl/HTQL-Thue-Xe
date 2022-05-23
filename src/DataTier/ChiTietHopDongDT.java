/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTier;

import DATABASE.Model;
import DataContext.ChiTietHopDong;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author win10
 */
public class ChiTietHopDongDT {
    Connection cn = Model.opConnection();
    public boolean ThemCT(ChiTietHopDong ct) {
        try {
            
            String sql="insert into tblChiTietHopDong(MaHopDong,MaXe,NgayGiao,NgayTra) values (?,?,?,?)";  
            PreparedStatement them = cn.prepareStatement(sql);
            them.setString(1, ct.getMaHopDong());
            them.setString(2, ct.getMaXe());
            them.setDate(3, ct.getNgaynhanxe());
            them.setDate(4, ct.getNgaytraxe());
            return them.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
}
