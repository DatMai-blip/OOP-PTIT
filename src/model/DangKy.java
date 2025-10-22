package model;

public class DangKy {
    private String maDangKy;
    private String maSinhVien;
    private String maLop;
    private String ngayDangKy;

    public DangKy(String maDangKy, String maSinhVien, String maLop, String ngayDangKy) {
        this.maDangKy = maDangKy;
        this.maSinhVien = maSinhVien;
        this.maLop = maLop;
        this.ngayDangKy = ngayDangKy;
    }

    public DangKy() {}

    public String getMaDangKy() {
        return maDangKy;
    }

    public void setMaDangKy(String maDangKy) {
        this.maDangKy = maDangKy;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(String ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    @Override
    public String toString() {
        return "DangKy{" +
                "maDangKy='" + maDangKy + '\'' +
                ", maSinhVien='" + maSinhVien + '\'' +
                ", maLop='" + maLop + '\'' +
                ", ngayDangKy='" + ngayDangKy + '\'' +
                '}';
    }
}
