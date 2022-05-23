
package DataContext;


public class Xe {
    private String MaXe;
    private String TenXe;
    private String MauXe;
    private int SoChoNgoi;
    private double GiaThue;
    private String NamSanXuat;
    private String BienSoXe;
    private byte[] AnhXe;
    private String MaHang;
    private String TrangThai;

    public Xe() {
    }

    public Xe(String MaXe, String TenXe, String MauXe, int SoChoNgoi, double GiaThue, String NamSanXuat, String BienSoXe, byte[] AnhXe, String MaHang, String TrangThai) {
        this.MaXe = MaXe;
        this.TenXe = TenXe;
        this.MauXe = MauXe;
        this.SoChoNgoi = SoChoNgoi;
        this.GiaThue = GiaThue;
        this.NamSanXuat = NamSanXuat;
        this.BienSoXe = BienSoXe;
        this.AnhXe = AnhXe;
        this.MaHang = MaHang;
        this.TrangThai = TrangThai;
    }
    
    public String getMaXe() {
        return MaXe;
    }

    public void setMaXe(String MaXe) {
        this.MaXe = MaXe;
    }

    public String getTenXe() {
        return TenXe;
    }

    public void setTenXe(String TenXe) {
        this.TenXe = TenXe;
    }

    public String getMauXe() {
        return MauXe;
    }

    public void setMauXe(String MauXe) {
        this.MauXe = MauXe;
    }

    public int getSoChoNgoi() {
        return SoChoNgoi;
    }

    public void setSoChoNgoi(int SoChoNgoi) {
        this.SoChoNgoi = SoChoNgoi;
    }

    public double getGiaThue() {
        return GiaThue;
    }

    public void setGiaThue(double GiaThue) {
        this.GiaThue = GiaThue;
    }

    public String getNamSanXuat() {
        return NamSanXuat;
    }

    public void setNamSanXuat(String NamSanXuat) {
        this.NamSanXuat = NamSanXuat;
    }

    public String getBienSoXe() {
        return BienSoXe;
    }

    public void setBienSoXe(String BienSoXe) {
        this.BienSoXe = BienSoXe;
    }

    public byte[] getAnhXe() {
        return AnhXe;
    }

    public void setAnhXe(byte[] AnhXe) {
        this.AnhXe = AnhXe;
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }
    
    
}
