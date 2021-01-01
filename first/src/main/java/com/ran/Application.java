package com.ran;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ran.mapper")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("/*-------------------------------------------\r\n" + 
				"|               W E L C O M E               |\r\n" + 
				"============================================*/");
	}
}
