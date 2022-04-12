package me.mustafaesattemel.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import me.mustafaesattemel.business.abstracts.UserCheckService;
import me.mustafaesattemel.entities.concretes.User;

public class UserCheckManager implements UserCheckService{
	/*
	 * private List<String> isMailDifferent; public UserCheckManager() {
	 * this.isMailDifferent=new ArrayList<String>(); }
	 */
	
	
	@Override
	public boolean getName(User user) {
		if(user.getName().length()>=2) {
			return true;
		}
		return false;
	}

	@Override
	public boolean getSurname(User user) {
		if(user.getSurname().length()>=2) {
			return true;
		}
		return false;
	}

	@Override
	public boolean getEmail(User user) {
//		String regex = "^(.+)@(.+)$";
//		Pattern pattern = Pattern.compile(regex);
//		Matcher matcher = pattern.matcher(user.getEmail());
//		if(matcher.equals(true)) {
//			isMailDifferent.add(user.getEmail());
//			for(String s:isMailDifferent) {
//				if(s==user.getEmail()) {
//					return true;
//				}
//			}
//			return true;
//		}

		Pattern pattern = Pattern.compile( "^(.+)@(.+)$");
		Matcher matcher = pattern.matcher(user.getEmail());
		return matcher.matches();
	}

	@Override
	public boolean getPassword(User user) {
		if(user.getPassword().length()>=6) {
			return true;
		}else {
			
		}
		return false;
	}



	@Override
	public List<String> differentMails(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
