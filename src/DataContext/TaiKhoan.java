
package DataContext;

public class TaiKhoan extends NhanVien{
    private int MaTaiKhoan;
    private String TenTaiKhoan;
    private String MatKhau;
    private String MaNhanVien;

    public TaiKhoan() {
    }

    
    public TaiKhoan(int MaTaiKhoan, String TenTaiKhoan, String MatKhau, String MaNhanVien) {
        this.MaTaiKhoan = MaTaiKhoan;
        this.TenTaiKhoan = TenTaiKhoan;
        this.MatKhau = MatKhau;
        this.MaNhanVien =MaNhanVien;
    }

    public int getMaTaiKhoan() {
        return MaTaiKhoan;
    }

    public void setMaTaiKhoan(int MaTaiKhoan) {
        this.MaTaiKhoan = MaTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return TenTaiKhoan;
    }

    public void setTenTaiKhoan(String TenTaiKhoan) {
        this.TenTaiKhoan = TenTaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }
    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

}
