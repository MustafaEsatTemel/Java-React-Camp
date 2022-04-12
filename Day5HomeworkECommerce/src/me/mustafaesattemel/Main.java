package me.mustafaesattemel;

import me.mustafaesattemel.business.concretes.UserCheckManager;
import me.mustafaesattemel.business.concretes.UserManager;
import me.mustafaesattemel.business.concretes.UserVerifiactionManager;
import me.mustafaesattemel.core.GoogleManagerAdapter;
import me.mustafaesattemel.dataAccess.concretes.HibernateUserDao;
import me.mustafaesattemel.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setAge(18);
		user.setEmail("esattemel130@gmail.com");
		user.setName("Esad");
		user.setSurname("Temel");
		user.setPassword("esssaa");
		
		UserManager userManager = new UserManager(new UserCheckManager(), new UserVerifiactionManager(),
				new HibernateUserDao(), new GoogleManagerAdapter());
		
		userManager.signUp(user);

	//	userManager.signIn(user);
		

	}

}
