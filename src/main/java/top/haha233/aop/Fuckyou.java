package top.haha233.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Fuckyou {
	private static Logger log = Logger.getLogger(Fuckyou.class);
	private final static String CNM = "execution(* top.haha233.service..*.*(..))";

	@Before(value = CNM)
	public void before(JoinPoint jp) {
//		System.out.println("fuck" + jp.getSignature().getName());
		log.info("在运行之前" + jp.getTarget()+"的"+jp.getSignature().getName()+"方法");
//		System.out.println("在座各位都是垃圾");
	}
//	@After(value = CNM)
//	public void after(JoinPoint jp) {
//		log.info("在运行之后" + jp.getTarget()+"的"+jp.getSignature().getName()+"方法");
//	}
}
