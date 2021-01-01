package com.ran.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ran.entity.Student;
import com.ran.mapper.StudentMapper;
/**
 * 学生Service
 * @author Administrator
 *
 */
@Service
public class StudentService {

	@Autowired
	StudentMapper stuMapper;
	
	public synchronized boolean add(Student student) {
		return stuMapper.addStudent(student);
	}
	
	public PageInfo<Student> queryAll(){
		PageHelper.startPage(1, 3);
		List<Student> students = stuMapper.queryAll();
		PageInfo<Student> pageInfo = new PageInfo<Student>(students);
		return pageInfo;
	}
}
