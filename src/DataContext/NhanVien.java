package DataContext;

import java.sql.Date;

public class NhanVien extends ChucVu {
    private String MaNhanVien;
    private String TenNhanVien;
    private String DiaChi;
    private String SoDienThoai;
    private String CCCD;
    private String GioiTinh;
    private String NgaySinh;
    private ChucVu ChucVu;

    public NhanVien() {
    }

    public NhanVien(String MaNhanVien, String TenNhanVien, String DiaChi, String SoDienThoai, String CCCD, String GioiTinh, String NgaySinh, ChucVu ChucVu) {
        this.MaNhanVien = MaNhanVien;
        this.TenNhanVien = TenNhanVien;
        this.DiaChi = DiaChi;
        this.SoDienThoai = SoDienThoai;
        this.CCCD = CCCD;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.ChucVu = ChucVu;
    }

    public NhanVien(String MaNhanVien, String TenNhanVien, String DiaChi, String SoDienThoai, String CCCD, String GioiTinh, String NgaySinh, ChucVu ChucVu, int MaChucVu, String TenChucVu) {
        super(MaChucVu, TenChucVu);
        this.MaNhanVien = MaNhanVien;
        this.TenNhanVien = TenNhanVien;
        this.DiaChi = DiaChi;
        this.SoDienThoai = SoDienThoai;
        this.CCCD = CCCD;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.ChucVu = ChucVu;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
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

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public ChucVu getChucVu() {
        return ChucVu;
    }

    public void setChucVu(ChucVu ChucVu) {
        this.ChucVu = ChucVu;
    }
    


    
    
}