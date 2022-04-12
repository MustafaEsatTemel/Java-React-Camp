package me.mustafaesattemel.business.abstracts;

import me.mustafaesattemel.entities.concretes.User;

public interface UserService {

	void signIn(User user);
	void signUp(User user);
	
}
