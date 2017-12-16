package top.haha233.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取对象
//		HelloSpring helloSpring = (HelloSpring) context.getBean("hello");
//		helloSpring.print();
//		Role zhanga =  context.getBean(Role.class);
		Collection c = (Collection) context.getBean("xxx");
		System.out.println(c);
	}
}
