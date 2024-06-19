package org.example.springbootjwtwithcookie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShoppingController {

    @GetMapping("/home")
    public String home() {
        return "home.html";
    }
}
