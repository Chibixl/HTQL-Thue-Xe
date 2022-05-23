
package DataContext;

import java.sql.Date;

public class HopDong {
    private String MaHopDong;
    private double TongTien;
    private Date NgayLap;
    private String MaNhanVien;
    private String MaKhachHang;

    public HopDong() {
    }

    public HopDong(String MaHopDong, double TongTien, Date NgayLap, String MaNhanVien, String MaKhachHang) {
        this.MaHopDong = MaHopDong;
        this.TongTien = TongTien;
        this.NgayLap = NgayLap;
        this.MaNhanVien = MaNhanVien;
        this.MaKhachHang = MaKhachHang;
    }

    public String getMaHopDong() {
        return MaHopDong;
    }

    public void setMaHopDong(String MaHopDong) {
        this.MaHopDong = MaHopDong;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

    public Date getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(Date NgayLap) {
        this.NgayLap = NgayLap;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }
    
    
}
