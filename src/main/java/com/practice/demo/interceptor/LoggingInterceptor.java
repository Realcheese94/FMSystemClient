package com.practice.demo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

//가장 기본이 되는 인터셉터, 모든 요청에 대한 로깅을 한다.
@Slf4j
public class LoggingInterceptor implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		log.info("LoggingInterceptor::Request Path : "+request.getContextPath()+" || Request_Ip_Info : "+request.getRemoteAddr());
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		log.info("LoggingInterceptor:: Request Path : "+request.getContextPath()+" || Request_Ip_Info : "+request.getRemoteAddr());
		
	}
}
