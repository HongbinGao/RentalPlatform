package com.rp.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.rp.common.constant.Constant;
import com.rp.common.interceptor.AuthInterceptor;
import com.rp.common.interceptor.BackUrlInterceptor;

/**
 * 配置类
 * 
 * @author 高洪滨
 *
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	@Autowired
	private AuthInterceptor authInterceptor;

	@Autowired
	private BackUrlInterceptor backUrlInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		InterceptorRegistration addAuthInterceptor = registry.addInterceptor(authInterceptor);
		addAuthInterceptor.addPathPatterns(Constant.AUTH_INTERCEPT_PATH);
		addAuthInterceptor.excludePathPatterns(Constant.AUTH_UNINTERCEPT_PATH);
		InterceptorRegistration addBackUrlInterceptor = registry.addInterceptor(backUrlInterceptor);
		addBackUrlInterceptor.addPathPatterns(Constant.BACK_URL_INTERCEPT_PATH);
	}

}
