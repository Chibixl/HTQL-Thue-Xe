
package DataContext;
import java.sql.Date;
public class ChiTietHopDong {
    private String MaHopDong;
    private String MaXe;
    private Date Ngaynhanxe;
    private Date ngaytraxe;

    public ChiTietHopDong() {
    }

    public ChiTietHopDong(String MaHopDong, String MaXe, Date Ngaynhanxe, Date ngaytraxe) {
        this.MaHopDong = MaHopDong;
        this.MaXe = MaXe;
        this.Ngaynhanxe = Ngaynhanxe;
        this.ngaytraxe = ngaytraxe;
    }

    public String getMaHopDong() {
        return MaHopDong;
    }

    public void setMaHopDong(String MaHopDong) {
        this.MaHopDong = MaHopDong;
    }

    public String getMaXe() {
        return MaXe;
    }

    public void setMaXe(String MaXe) {
        this.MaXe = MaXe;
    }

    public Date getNgaynhanxe() {
        return Ngaynhanxe;
    }

    public void setNgaynhanxe(Date Ngaynhanxe) {
        this.Ngaynhanxe = Ngaynhanxe;
    }

    public Date getNgaytraxe() {
        return ngaytraxe;
    }

    public void setNgaytraxe(Date ngaytraxe) {
        this.ngaytraxe = ngaytraxe;
    }
    
    
}