package top.haha233.dal.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import top.haha233.dal.UserDao;
import top.haha233.model.User;

@Repository("userDao")
//@Scope("prototype")
public class UserDaoImpl implements UserDao {
	@Override
	public int save(User user) {
		System.out.println("保存用户信息到数据库中");
		return 0;
	}

	public void edit() {
		System.out.println("进行用户信息修改！");
	}
}
