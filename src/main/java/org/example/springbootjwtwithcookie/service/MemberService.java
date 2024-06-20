package org.example.springbootjwtwithcookie.service;

import lombok.RequiredArgsConstructor;
import org.example.springbootjwtwithcookie.domain.member.MemberRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public void join() {
        System.out.println("join");
    }

    public void login() {
        System.out.println("login");
    }

    public void logout() {
        System.out.println("logout");
    }
}
