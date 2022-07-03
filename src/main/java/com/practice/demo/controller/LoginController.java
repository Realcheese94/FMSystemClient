package com.practice.demo.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.demo.dto.MemberDto;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/login")
@Slf4j
public class LoginController {

	@RequestMapping("/doLogin.ssm")
	public String doLogin(MemberDto dto,HttpServletRequest req,HttpServletResponse res) {
		Cookie mcookie = new Cookie("loginYn", "Y");
		mcookie.setMaxAge(1000);
		res.addCookie(mcookie);
		return "main";
	}
}
