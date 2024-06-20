package org.example.springbootjwtwithcookie.controller;

import lombok.RequiredArgsConstructor;
import org.example.springbootjwtwithcookie.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/shopping")
public class ShoppingController {
    private final MemberService memberService;

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
