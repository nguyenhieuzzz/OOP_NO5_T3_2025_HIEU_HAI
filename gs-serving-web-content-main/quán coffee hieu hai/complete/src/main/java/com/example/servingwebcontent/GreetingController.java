package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.servingwebcontent.Model.*;

import java.util.Arrays;

@Controller
public class GreetingController {

    // Coffee shop homepage
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("shopName", "Coffee Delight");
        return "home";
    }

    // Customer management
    @GetMapping("/customer")
    public String customerManagement(
            @RequestParam(name="customerId", required=false, defaultValue="C001") String customerId,
            Model model) {
        KhachHang customer = new KhachHang(customerId, "John Doe", "0987654321", "Gold");
        model.addAttribute("customer", customer);
        return "customer";
    }

    // Product menu
    @GetMapping("/menu")
    public String productMenu(
            @RequestParam(name="category", required=false, defaultValue="Coffee") String category,
            Model model) {
        SanPham[] products = {
            new SanPham("CF01", "Espresso", "Coffee", 35000, true),
            new SanPham("CF02", "Latte", "Coffee", 45000, true),
            new SanPham("T01", "Green Tea", "Tea", 30000, true)
        };
        model.addAttribute("products", Arrays.asList(products));
        model.addAttribute("category", category);
        return "menu";
    }

    // Transaction processing
    @GetMapping("/order")
    public String processOrder(
            @RequestParam(name="orderId", required=false, defaultValue="ORD001") String orderId,
            Model model) {
        GiaoDich transaction = new GiaoDich(orderId, "C001");
        transaction.themSanPham(new SanPham("CF01", "Espresso", "Coffee", 35000, true));
        transaction.themSanPham(new SanPham("T01", "Green Tea", "Tea", 30000, true));
        
        model.addAttribute("order", transaction);
        model.addAttribute("total", transaction.getTongTien());
        return "order";
    }

    // Simple greeting page (kept from original)
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}