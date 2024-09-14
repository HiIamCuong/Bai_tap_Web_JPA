package vn.iotstar.dao;

import vn.iotstar.models.User;

public interface UserDao {
	User get(String username);
	void insert(User user);
	void modified(String username,String password);
	boolean checkExistEmail(String email);
	boolean checkExistUsername(String username);
	boolean checkExistPhone(String phone);
}
