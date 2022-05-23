
package DataContext;

import java.sql.Date;

public class HoaDon {
    private String MaHoaDon;
    private double TongTien;
    private Date NgayLap;
    private String MaHopDong;

    public HoaDon() {
    }

    public HoaDon(String MaHoaDon, double TongTien, Date NgayLap, String MaHopDong) {
        this.MaHoaDon = MaHoaDon;
        this.TongTien = TongTien;
        this.NgayLap = NgayLap;
        this.MaHopDong = MaHopDong;
    }

    public String getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(String MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
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

    public String getMaHopDong() {
        return MaHopDong;
    }

    public void setMaHopDong(String MaHopDong) {
        this.MaHopDong = MaHopDong;
    }
    
    
}
