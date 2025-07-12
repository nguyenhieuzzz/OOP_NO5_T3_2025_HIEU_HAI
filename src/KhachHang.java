public class KhachHang {
    private String maKhachHang;
    private String hoTen;
    private String soDienThoai;
    private String hangThanhVien;

    public KhachHang(String maKhachHang, String hoTen, String soDienThoai, String hangThanhVien) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.hangThanhVien = hangThanhVien;
    }

    // Getters
    public String getMaKhachHang() {
        return maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public String getHangThanhVien() {
        return hangThanhVien;
    }

    // Setters
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setHangThanhVien(String hangThanhVien) {
        this.hangThanhVien = hangThanhVien;
    }

    @Override
    public String toString() {
        return "Khách hàng: " + hoTen + " (" + maKhachHang + "), SĐT: " + soDienThoai + ", Hạng: " + hangThanhVien;
    }
}
