package com.example.demo.controller;

import com.example.demo.model.KhachHang;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class ABCController {

    @GetMapping("/")
    public String showKhachHang(Model model) {
        ArrayList<KhachHang> khachHangs = new ArrayList<>();
        khachHangs.add(new KhachHang("01", "Nguyen"));
        khachHangs.add(new KhachHang("02", "Tran"));

        model.addAttribute("KH", khachHangs);

        return "trangchinh";
    }
}
