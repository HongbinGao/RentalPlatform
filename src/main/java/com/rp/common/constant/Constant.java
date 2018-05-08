package com.rp.common.constant;

/**
 * 常量类
 * 
 * @author 高洪滨
 *
 */
public class Constant {
	/* 身份验证拦截路径 */
	public final static String[] AUTH_INTERCEPT_PATH = { "/gotoPublishHouse", "/house/publishHouse" };
	/* 身份验证忽略路径 */
	public final static String[] AUTH_UNINTERCEPT_PATH = { "/gotoSignUp", "/account/signUp", "/gotoSignIn",
			"/account/signIn", "/js/**", "/css" };

	public static String BACK_URL = "/gotoHome";

	public final static String[] BACK_URL_INTERCEPT_PATH = { "/gotoSignIn" };

}
