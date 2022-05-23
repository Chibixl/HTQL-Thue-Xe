/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataContext;

/**
 *
 * @author win10
 */
public class KhachHang {
    private String MaKhachHang;
    private String TenKhachHang;
    private String DiaChi;
    private String SoDienThoai;
    private String CCCD;
    private String TenCongTy;

    public KhachHang() {
    }

    public KhachHang(String MaKhachHang, String TenKhachHang, String DiaChi, String SoDienThoai, String CCCD, String TenCongTy) {
        this.MaKhachHang = MaKhachHang;
        this.TenKhachHang = TenKhachHang;
        this.DiaChi = DiaChi;
        this.SoDienThoai = SoDienThoai;
        this.CCCD = CCCD;
        this.TenCongTy = TenCongTy;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String TenKhachHang) {
        this.TenKhachHang = TenKhachHang;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getTenCongTy() {
        return TenCongTy;
    }

    public void setTenCongTy(String TenCongTy) {
        this.TenCongTy = TenCongTy;
    }
    
    
    
    
}
