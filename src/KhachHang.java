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

    @Override
    public String toString() {
        return "Khách hàng: " + hoTen + " (" + maKhachHang + "), SĐT: " + soDienThoai + ", Hạng: " + hangThanhVien;
    }
}

