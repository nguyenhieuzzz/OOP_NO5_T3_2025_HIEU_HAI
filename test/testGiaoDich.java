public class testGiaoDich {
    public static void main(String[] args) {
        // Tạo sản phẩm để thêm vào giao dịch
        SanPham sp1 = new SanPham("SP01", "Cà phê sữa", "Cà phê", 25000, "Ngon", true);
        SanPham sp2 = new SanPham("SP02", "Trà đào", "Trà", 30000, "Mát lạnh", true);

        // Tạo giao dịch mới
        GiaoDich gd = new GiaoDich("GD01", "KH01", "2025-06-25 14:00");
        gd.themSanPham(sp1);
        gd.themSanPham(sp2);

        // In thông tin giao dịch
        System.out.println(gd);
    }
}
