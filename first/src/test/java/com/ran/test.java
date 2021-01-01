package com.ran;

import java.util.List;

//import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.pagehelper.PageInfo;
import com.ran.Controller.StudentController;
import com.ran.Service.StudentService;
import com.ran.entity.Student;
//import com.ran.entity.Student;
//import com.ran.mapper.StudentMapper;
//
//import junit.framework.Assert;
import com.ran.mapper.StudentMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class test {

	@Autowired
	StudentMapper stuMapper;
	
//	@Test
//	public void select() {
//		Student stu = stuMapper.queryById(1L);
//		System.out.println(stu);
////		List<Student> list = stuMapper.queryAll();
////		for(Student stu : list) {
////			System.out.println(stu);
////		}
//	}
//	
//	@Test
//	public void insert() {
//		Student student = new Student();
//		student.setsNo(1234L);
//		student.setsName("王五");
//		student.setsAge(12);
//		student.setsAddress("河北");
//		boolean result = stuMapper.addStudent(student);
//		System.out.println(result);
//	}
//	@Test
//	public void update() {
//		Student student = new Student();
//		student.setsName("李四");
//		student.setsAge(25);
//		int update = stuMapper.update(student);
//		System.out.println(update);
//	}
	
	@Autowired
	StudentService stuService;
	
	@Test
	public void testPageHelper() {
		PageInfo<Student> queryAll = stuService.queryAll();
		System.out.println(queryAll);
	}
	@Autowired
	StudentController stu;
	
//	@Test
//	public void testLogAspect() {
//		
//		stu.remove();
//	}
}
