package com.ran.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ran.entity.Student;
/**
 * 学生dao 可以进行基本增删改查
 * @author Administrator
 *
 */
@Repository
public interface StudentMapper{
	
	Student queryById(Long id);
	
	List<Student> queryAll();
	
	boolean addStudent(Student student);
	
	int update(Student student);
}
