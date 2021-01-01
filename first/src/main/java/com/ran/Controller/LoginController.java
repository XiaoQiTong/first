package com.ran.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ran.Service.UserService;
import com.ran.entity.User;
import com.ran.util.AjaxResult;

@Controller
public class LoginController {

	@Autowired
	UserService userService;
	
	/**
	 * 登录请求跳转
	 * @return
	 */
	@GetMapping("/login")
	public String view() {
		return "login";
	}
	
	/**
	 * 	登录
	 * @param name
	 * @param pwd
	 * @return
	 */
	@PostMapping("/login")
	@ResponseBody
	public AjaxResult login(@RequestParam("name")String name, @RequestParam("pwd")String pwd) {
		System.out.println(name+"---"+pwd);
		if("".equals(name) || "".equals(pwd)) {
			return AjaxResult.error("用户名或密码错误");
		}else {
//			if(userService.login(new User("1", name, pwd))) {
//				return AjaxResult.success("登录成功");
//			}
			return AjaxResult.error("用户名或密码错误");
		}
	}
}
