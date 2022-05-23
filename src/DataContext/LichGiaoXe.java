
package DataContext;

import java.sql.Date;

public class LichGiaoXe {
    private int SoThuTu;
    private Date NgayGiao;
    private Date NgayTra;
    private String TinhTrangXe;

    public LichGiaoXe() {
    }

    public LichGiaoXe(int SoThuTu, Date NgayGiao, Date NgayTra, String TinhTrangXe) {
        this.SoThuTu = SoThuTu;
        this.NgayGiao = NgayGiao;
        this.NgayTra = NgayTra;
        this.TinhTrangXe = TinhTrangXe;
    }

    public int getSoThuTu() {
        return SoThuTu;
    }

    public void setSoThuTu(int SoThuTu) {
        this.SoThuTu = SoThuTu;
    }

    public Date getNgayGiao() {
        return NgayGiao;
    }

    public void setNgayGiao(Date NgayGiao) {
        this.NgayGiao = NgayGiao;
    }

    public Date getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(Date NgayTra) {
        this.NgayTra = NgayTra;
    }

    public String getTinhTrangXe() {
        return TinhTrangXe;
    }

    public void setTinhTrangXe(String TinhTrangXe) {
        this.TinhTrangXe = TinhTrangXe;
    }
    
}
