package me.mustafaesattemel.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.mustafaesattemel.hrms.business.abstracts.UserService;
import me.mustafaesattemel.hrms.dataAccess.abstracts.UserDao;
import me.mustafaesattemel.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService {

	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public List<User> getAll() {
		
		return this.userDao.findAll();
	}

}
