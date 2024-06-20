package org.example.springbootjwtwithcookie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShoppingController {

    @GetMapping("/home")
    public String home() {
        return "home.html";
    }

    @GetMapping("/login")
    public String login() {
        return "login.html";
    }

    @GetMapping("/join")
    public String join() {
        return "join.html";
    }

    @GetMapping("/logout")
    public String logout() {
        return "logout.html";
    }
}
