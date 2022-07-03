package com.practice.demo.interceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class LoginCheckInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Cookie[] cookies = request.getCookies();
		boolean loginFlag = false;
		if(cookies != null && cookies.length > 0) {
		for(Cookie ck : cookies) {
			if(ck.getName().equals("loginYn") && ck.getValue().equals("Y")) {				
				loginFlag = true;
			}
		}
		}
		log.info("LoginCHeckInterceptor :: LoginYn >>" + loginFlag);
		
		return true;
	}
}
