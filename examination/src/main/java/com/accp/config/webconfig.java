package com.accp.config;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class webconfig extends WebMvcConfigurationSupport{
	
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO 地址引导
		registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
	}
	@Override
	protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		// TODO 配置消息转换器
	}
	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		// TODO 配置拦截器
		
	}
}
