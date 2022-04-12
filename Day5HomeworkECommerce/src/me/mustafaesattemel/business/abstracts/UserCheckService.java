package me.mustafaesattemel.business.abstracts;

import java.util.List;

import me.mustafaesattemel.entities.concretes.User;

public interface UserCheckService {
	List<String> differentMails(String string);
	boolean getName(User user);
	boolean getSurname(User user);
	boolean getEmail(User user);
	boolean getPassword(User user);
	
}
