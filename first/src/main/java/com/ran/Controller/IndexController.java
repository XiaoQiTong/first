package com.ran.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/index")
	public String index(ModelMap app) {
		System.out.println("index");
		app.put("message", "333");
		return "index";
	}
}
