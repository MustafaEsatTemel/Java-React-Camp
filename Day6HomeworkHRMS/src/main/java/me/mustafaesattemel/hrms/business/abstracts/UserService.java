package me.mustafaesattemel.hrms.business.abstracts;

import java.util.List;

import me.mustafaesattemel.hrms.entities.concretes.User;

public interface UserService {

	List<User> getAll();
}
