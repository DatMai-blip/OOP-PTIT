package model;


public class BangDiem {
    private String maBangDiem;
    private String maDangKy;
    private float diemChuyenCan;
    private float diemGiuaKy;
    private float diemCuoiKy;
    private float tongDiem;

    public BangDiem(String maBangDiem, String maDangKy, float diemChuyenCan, float diemGiuaKy, float diemCuoiKy) {
        this.maBangDiem = maBangDiem;
        this.maDangKy = maDangKy;
        this.diemChuyenCan = diemChuyenCan;
        this.diemGiuaKy = diemGiuaKy;
        this.diemCuoiKy = diemCuoiKy;
        this.tongDiem = calculateTongDiem();
    }

    public BangDiem() {}

    public String getMaBangDiem() {
        return maBangDiem;
    }

    public void setMaBangDiem(String maBangDiem) {
        this.maBangDiem = maBangDiem;
    }

    public String getMaDangKy() {
        return maDangKy;
    }

    public void setMaDangKy(String maDangKy) {
        this.maDangKy = maDangKy;
    }

    public float getDiemChuyenCan() {
        return diemChuyenCan;
    }

    public void setDiemChuyenCan(float diemChuyenCan) {
        this.diemChuyenCan = diemChuyenCan;
        this.tongDiem = calculateTongDiem();
    }

    public float getDiemGiuaKy() {
        return diemGiuaKy;
    }

    public void setDiemGiuaKy(float diemGiuaKy) {
        this.diemGiuaKy = diemGiuaKy;
        this.tongDiem = calculateTongDiem();
    }

    public float getDiemCuoiKy() {
        return diemCuoiKy;
    }

    public void setDiemCuoiKy(float diemCuoiKy) {
        this.diemCuoiKy = diemCuoiKy;
        this.tongDiem = calculateTongDiem(); 
    }

    public float getTongDiem() {
        return tongDiem;
    }

    private float calculateTongDiem() {
        return (float) (0.1 * diemChuyenCan + 0.3 * diemGiuaKy + 0.6 * diemCuoiKy);
    }

    @Override
    public String toString() {
        return "BangDiem{" +
                "maBangDiem='" + maBangDiem + '\'' +
                ", maDangKy='" + maDangKy + '\'' +
                ", diemChuyenCan=" + diemChuyenCan +
                ", diemGiuaKy=" + diemGiuaKy +
                ", diemCuoiKy=" + diemCuoiKy +
                ", tongDiem=" + tongDiem +
                '}';
    }
}
