package com.ran.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
/**
 * 日志通知类
 * @author Administrator
 *
 */
@Aspect
@Component
public class LogAspect {

	public static final Logger log = LoggerFactory.getLogger(LogAspect.class);
	
	/**
	 * 切点
	 */
	@Pointcut("@annotation(com.ran.log.Log)")
	public void logPointcut() {
		
	}
	
	/**
	 * 前置通知
	 * @param joinPoint
	 */
	@Before("logPointcut()")
	public void beforeAspect(JoinPoint joinPoint) {
		System.out.println("前置通知");
		log.error(">>>");
	}
	
	/**
	 * 后置通知
	 * @param joinPoint
	 */
	@After("logPointcut()")
	public void afterAspect() {
		System.out.println("后置通知");
	}
	
	/**
	 * 异常通知
	 * @param joinPoint
	 */
	@AfterThrowing("logPointcut()")
	public void throwAspect() {
		System.out.println("异常通知");
	}
}
