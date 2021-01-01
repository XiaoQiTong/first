package com.ran.shiro;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 	请求过滤器
 * @author Administrator
 *
 */
public class ShiroFilterFactory {
	/**
	 * Shiro内置过滤器，可以实现权限相关的拦截器
	 *    	常用的过滤器：
	 *       anon: 无需认证（登录）可以访问
	 *       authc: 必须认证才可以访问
	 *       user: 如果使用rememberMe的功能可以直接访问
	 *       perms： 该资源必须得到资源权限才可以访问
	 *       role: 该资源必须得到角色权限才可以访问
	 */
	public static Map<String, String> shiroFilterMap(){
		//设置路径映射，用LinkedHashMap 保证有序
		LinkedHashMap<String, String> filterMap = new LinkedHashMap<>();
		//对所有用户认证
		filterMap.put("/static/**", "anon");
		filterMap.put("/admin/login", "anon");
		filterMap.put("/admin/logout", "logout");
		
		//前端
		filterMap.put("/", "anon");
		filterMap.put("/index", "anon");//任务调度暂时放开
		
		//对所有页面进行认证
		filterMap.put("/**","authc");
		
		return filterMap;
	}
}
