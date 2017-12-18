package top.haha233.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
public class AroundLogger {
	private static final Logger log = Logger.getLogger(AroundLogger.class);
	@Around("execution(* top.haha233.service..*.*(..))")
	public Object round(ProceedingJoinPoint jp) throws Throwable {
		System.out.println(jp.getArgs()[0]);
		System.out.println("aroundBefore");
		Object o;
		try {
			o = jp.proceed();
			System.out.println("aroundAfter");
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			throw throwable;
		}
		return o;
	}
}
