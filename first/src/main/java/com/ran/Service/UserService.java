package com.ran.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ran.entity.User;
import com.ran.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	UserMapper userMapper;
	
//	public boolean login(User user) {
//		User selectById = userMapper.selectById(user.getId());
//		if(user.getPwd().equals(selectById)) {
//			return true;
//		}else {
//			return false;
//		}
//	}
}
