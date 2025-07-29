package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.servingwebcontent.Model.KhachHang;

@Controller
public class CoffeeController {

    @GetMapping("/welcome")
    public String welcome(@RequestParam(name="tenQuan", required=false, defaultValue="Quán Coffee") String tenQuan, Model model) {
        model.addAttribute("tenQuan", tenQuan);
        System.out.println("Welcome request received for: " + tenQuan);
        return "welcome";
    }

    @GetMapping("/quanly")
    public String quanLy(@RequestParam(name="tenKhachHang", required=false, defaultValue="Khách") String tenKhachHang, Model model) {
        model.addAttribute("tenKhachHang", tenKhachHang);
        System.out.println("Quản lý request received with customer: " + tenKhachHang);
        return "quanly";
    }

    @GetMapping("/thongtin")
    public String thongTin(@RequestParam(name="tenKhachHang", required=false, defaultValue="Khách") String tenKhachHang, Model model) {
        model.addAttribute("tenKhachHang", tenKhachHang);
        System.out.println("Thông tin khách hàng: " + tenKhachHang);
        return "thongtin";
    }

    @GetMapping("/khachhang")
    public String khachHang(@RequestParam(name="maKhachHang", required=false, defaultValue="KH001") String maKhachHang, Model model) {
        // Simulate fetching customer data
        KhachHang kh = new KhachHang(maKhachHang, "Nguyễn Văn A", "0123456789");
        model.addAttribute("khachHang", kh);
        System.out.println("Customer data fetched for ID: " + maKhachHang);
        return "khachhang";
    }
}
