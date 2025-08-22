package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "redirect:/form";
    }

    @GetMapping("/form")
    public String form() {
        return "form";
    }

    @PostMapping("/form")
    public String submitForm(@RequestParam String message, Model model) {
        model.addAttribute("msg", "Đã nhận: " + message);
        return "form";
    }
}
