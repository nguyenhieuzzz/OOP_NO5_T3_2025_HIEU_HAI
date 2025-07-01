public class SanPham {
    
    private String tenSanPham;
    private String loai;
    private double giaBan;
    
    private boolean trangThai; 

    public SanPham(String maSanPham, String tenSanPham, String loai, double giaBan, String moTa, boolean trangThai) {
        
        this.tenSanPham = tenSanPham;
        this.loai = loai;
        this.giaBan = giaBan;
       
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return tenSanPham + " - " + loai + ": " + giaBan + " VND (" + (trangThai ? "Đang bán" : "Ngừng bán") + ")";
    }
}

