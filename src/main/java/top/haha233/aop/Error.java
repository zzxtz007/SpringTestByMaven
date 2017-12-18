package top.haha233.aop;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 通用功能
 * @author Ice_Dog
 */
@Aspect
public class Error {
	private static final Logger log = Logger.getLogger(Error.class);
	@AfterThrowing(value = "execution(* top.haha233.service..*.*(..))",throwing = "throwable")
	public void afterThrowing(JoinPoint jp,Throwable throwable){
		log.info("发生了错误"+throwable.toString());
//		ex.printStackTrace();
	}
	@AfterReturning(value = "execution(* top.haha233.service..*.*(..))",returning = "o")
	public void aftterReturn(JoinPoint jp,Object o){
		log.info("有了返回值"+o);
	}
	@Before("execution(* top.haha233.service..*.*(..))")
	public void before(){
		System.out.println("卖个萌");
	}
}
