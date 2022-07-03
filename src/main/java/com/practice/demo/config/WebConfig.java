package com.practice.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.practice.demo.interceptor.LoggingInterceptor;
import com.practice.demo.interceptor.LoginCheckInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer{

	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		//기본 로깅 인터셉터
		registry.addInterceptor(new LoggingInterceptor()).addPathPatterns("/**")
		.excludePathPatterns("/static/**","/css/**","/fonts/**","/images/**","/vendor/**","/js/**");
		
		//로그인 여부 체크 인터셉터
		registry.addInterceptor(new LoginCheckInterceptor()).addPathPatterns("/**")
		.excludePathPatterns("/static/**","/css/**","/fonts/**","/images/**","/vendor/**","/js/**");
	}
}
