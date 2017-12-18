package top.haha233.service.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.haha233.demo.SpringConfig;

/**
 * UserServiceImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 */
public class fuckyouImplTest {
	//	public UserService getUs() {
//		return us;
//	}
//
//	public void setUs(UserService us) {
//		this.us = us;
//	}
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}

	@Before
	public void before() throws Exception {
//		user = new User();
//		user.setId("11");
//		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//		us = (UserService) context.getBean("userService");
//		System.out.println(us);
//		us = (UserService) context.getBean("userService");
//		System.out.println(us);
	}

	@After
	public void after() throws Exception {
	}

	/**
	 * Method: getUs()
	 */
	@Test
	public void testGetUs() throws Exception {
	}

	/**
	 * Method: setUs(UserDao us)
	 */
	@Test
	public void testSetUs() throws Exception {
//TODO: Test goes here... 
	}

	/**
	 * Method: addNewUser(User user);
	 */
	@Test
	public void testAddNewUser() throws Exception {
//TODO: Test goes here...
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		UserServiceImpl userService = (UserServiceImpl) context.getBean("userService");
		userService.addNewUser(null);

//		System.out.println(context.getBean(UserServiceImpl.class));
	}
}
