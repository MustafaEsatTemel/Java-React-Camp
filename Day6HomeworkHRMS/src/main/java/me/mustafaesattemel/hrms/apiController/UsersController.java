package me.mustafaesattemel.hrms.apiController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.mustafaesattemel.hrms.business.abstracts.UserService;
import me.mustafaesattemel.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {

	
	private UserService userService;
	
	@Autowired
	public UsersController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/getall")
	public List<User> getAll(){
		return this.userService.getAll();
	}
	
	
}
