package top.haha233.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.haha233.service.UserService;
import top.haha233.service.impl.UserServiceImpl;


public class Test {
	@Autowired
	private UserService us;
	public static void main(String[] args) {
		ApplicationContext context =
				new AnnotationConfigApplicationContext(SpringConfig.class);
//		System.out.println(context.getBean("userService"));
		System.out.println(context.getBean(UserServiceImpl.class));
	}
}


