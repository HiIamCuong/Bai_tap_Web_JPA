package vn.iotstar.service;

import vn.iotstar.dao.UserDao;
import vn.iotstar.dao.UserDaoImpl;
import vn.iotstar.models.User;

public class UserServiceImpl implements UserService {
	UserDao userDAO = new UserDaoImpl();

	@Override
	public User login(String username, String password) {
		User user = this.findByUserName(username);
		if (user != null && password.equals(user.getPassword())) {
			return user;
		}
		return null;
	}
	@Override
	public User findByUserName(String username) {
		return userDAO.get(username);
	}

	@Override
	public User get(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(User user) {
		userDAO.insert(user);
	}

	@Override
	public boolean register(String email, String password, String username, String fullname, String phone) {
		if (userDAO.checkExistUsername(username)) {
			return false;
		}
		if (userDAO.checkExistEmail(username)) {
			return false;
		}
		if (userDAO.checkExistPhone(username)) {
			return false;
		}
		long millis = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(millis);
		userDAO.insert(new User(0,email, username, fullname, password, "/testmaven/views/img/default.png", 1, phone, date));
		return true;

	}

	@Override
	public boolean checkExistEmail(String email) {
		return userDAO.checkExistEmail(email);
	}

	@Override
	public boolean checkExistUsername(String username) {
		return userDAO.checkExistUsername(username);
	}

	@Override
	public boolean checkExistPhone(String phone) {
		return userDAO.checkExistPhone(phone);
	}
	@Override
	public User forgotpassword(String username, String password) {
		User user=this.findByUserName(username);
		if(user!=null)
		{
			this.modified(username, password);
			return user;
		}
		return null;
	}
	@Override
	public void modified(String username, String password) {
		userDAO.modified(username, password);
	}
	@Override
	public void updatefullname(String username, String fullname) {
		userDAO.updatefullname(username, fullname);
	}
	@Override
	public void updatephone(String username, String phone) {
		userDAO.updatephone(username, phone);
	}
	@Override
	public void updateavatar(String username, String avatar) {
		userDAO.updateavatar(username, avatar);
		
	}
}
