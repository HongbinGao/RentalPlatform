package com.rp.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 身份验证拦截器
 * 
 * @author 高洪滨
 *
 */
@Configuration
public class AuthInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		// return super.preHandle(request, response, handler);
		HttpSession session = request.getSession();
		Object object = session.getAttribute("session_id");
		if (object != null) {
			return true;
		}
		response.sendRedirect("gotoSignIn");
		return false;
	}

}
