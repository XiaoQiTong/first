package com.ran.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.ran.Service.StudentService;
import com.ran.entity.Student;
import com.ran.log.Log;
import com.ran.util.AjaxResult;
/**
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("queryUserName")
public class StudentController {

	@Autowired
	StudentService stuService;
	
	@RequestMapping("/view")
	public String view(ModelMap app) {
		app.put("message", "智障");
		return "index";
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public AjaxResult add(Student student) {
		if(stuService.add(student)) {
			return AjaxResult.success();
		}else {
			return AjaxResult.error();
		}
	}
	
	@RequestMapping("/remove")
	@Log
	public void remove() {
		System.out.println("删除");
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public Object list() {
		System.out.println("list");
		PageInfo<Student> queryAll = stuService.queryAll();
		return queryAll;
	}
}
