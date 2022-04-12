package me.mustafaesattemel.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import me.mustafaesattemel.dataAccess.abstracts.UserDao;
import me.mustafaesattemel.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	private List<User> users;
	public HibernateUserDao() {
		users=new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		System.out.println("Kullanýcý veri tabanýna eklendi : "+user.getEmail());
		users.add(user);
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi : "+user.getEmail());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý silindi : "+user.getEmail());
		users.remove(user);
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}

}
