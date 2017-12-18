package top.haha233.dal;

import org.springframework.stereotype.Repository;
import top.haha233.model.User;


public interface UserDao {
	int save(User user);
}
