import java.util.ArrayList;
import java.util.List;

public class GiaoDich {
    private String maGiaoDich;
    private String maKhachHang;
    private List<SanPham> danhSachSanPham;
    
    private double tongTien;

    public GiaoDich(String maGiaoDich, String maKhachHang, String thoiGian) {
        this.maGiaoDich = maGiaoDich;
        this.maKhachHang = maKhachHang;
        
        this.danhSachSanPham = new ArrayList<>();
        this.tongTien = 0;
    }

    public void themSanPham(SanPham sp) {
        danhSachSanPham.add(sp);
        
    }

    @Override
    public String toString() {
        return "Giao dịch: " + maGiaoDich + " - KH: " + maKhachHang + " - Tổng tiền: " + tongTien + " VND";
    }
}

