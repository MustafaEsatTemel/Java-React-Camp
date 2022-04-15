package me.mustafaesattemel.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import me.mustafaesattemel.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
