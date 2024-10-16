package vn.iotstar.service;

import vn.iotstar.models.User;

public interface UserService {
	User login(String username,String password);
	User get(String username);
	User findByUserName(String username);
	User forgotpassword(String username,String password);
	
	void modified(String username,String password);
	void insert(User user);
	boolean register(String email, String password, String username, String
	fullname, String phone);
	boolean checkExistEmail(String email);
	boolean checkExistUsername(String username);
	boolean checkExistPhone(String phone);
	void updatefullname(String username,String fullname);
	void updatephone(String username,String phone);
	void updateavatar(String username, String avatar);
}
