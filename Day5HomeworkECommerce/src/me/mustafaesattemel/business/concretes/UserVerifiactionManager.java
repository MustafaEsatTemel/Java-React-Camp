package me.mustafaesattemel.business.concretes;

import java.util.Scanner;

import me.mustafaesattemel.business.abstracts.UserVerififiactionService;
import me.mustafaesattemel.entities.concretes.User;

//Email approval vb.
public class UserVerifiactionManager implements UserVerififiactionService{

	@Override
	public void sendMail(User user) {
		System.out.println("Þu hesaba mail yollandý : "+user.getEmail());
		
	}

	@Override
	public boolean isEmailApproval(User user) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Use Y for verify email, or use N for its not me.");
		String deneme = scan.nextLine();
		if(deneme.equals("Y")) {
			return true;
		}else {
		
		}
		return false;
	}

}
