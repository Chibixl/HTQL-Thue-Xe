
package DataContext;

import java.sql.Date;

public class PhieuDenBu {
    private String SoPhieu;
    private Date NgayLap;
    private String MaXe;
    private String MaHopDong;

    public PhieuDenBu() {
    }

    public PhieuDenBu(String SoPhieu, Date NgayLap, String MaXe, String MaHopDong) {
        this.SoPhieu = SoPhieu;
        this.NgayLap = NgayLap;
        this.MaXe = MaXe;
        this.MaHopDong = MaHopDong;
    }

    public String getSoPhieu() {
        return SoPhieu;
    }

    public void setSoPhieu(String SoPhieu) {
        this.SoPhieu = SoPhieu;
    }

    public Date getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(Date NgayLap) {
        this.NgayLap = NgayLap;
    }

    public String getMaXe() {
        return MaXe;
    }

    public void setMaXe(String MaXe) {
        this.MaXe = MaXe;
    }

    public String getMaHopDong() {
        return MaHopDong;
    }

    public void setMaHopDong(String MaHopDong) {
        this.MaHopDong = MaHopDong;
    }
    
}
