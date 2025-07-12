public class SanPham {
    private String tenSanPham;
    private String loai;
    private double giaBan;
    private boolean trangThai;

    public SanPham(String tenSanPham, String loai, double giaBan, boolean trangThai) {
        this.tenSanPham = tenSanPham;
        this.loai = loai;
        this.giaBan = giaBan;
        this.trangThai = trangThai;
    }

    // Getters
    public String getTenSanPham() {
        return tenSanPham;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public String getLoai() {
        return loai;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    // Setters
    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return tenSanPham + " - " + loai + ": " + giaBan + " VND (" + (trangThai ? "Đang bán" : "Ngừng bán") + ")";
    }
}
