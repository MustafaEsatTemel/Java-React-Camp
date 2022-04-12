package me.mustafaesattemel.business.abstracts;

import me.mustafaesattemel.entities.concretes.User;

//Email send and verifiaction.
public interface UserVerififiactionService {

	void sendMail(User user);
	boolean isEmailApproval(User user);
}
