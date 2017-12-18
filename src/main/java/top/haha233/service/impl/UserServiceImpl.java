package top.haha233.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import top.haha233.dal.UserDao;
import top.haha233.model.User;
import top.haha233.service.UserService;

import javax.annotation.Resource;


/**开启懒加载 多实例
 * @author Ice_Dog
 */
//@Scope("prototype")
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource(name = "userDao")
	private UserDao ud;
	@Resource(name = "user")
	private User u;

	public UserServiceImpl() {
	}

	@Override
	public void addNewUser(User user) {
		int ret = ud.save(u);
		System.out.println(u);
		Integer i = Integer.parseInt(u.getId());
		if (ret > 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}


