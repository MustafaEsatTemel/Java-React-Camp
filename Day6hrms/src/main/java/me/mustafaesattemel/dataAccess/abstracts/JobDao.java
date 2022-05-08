package me.mustafaesattemel.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import me.mustafaesattemel.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job, Integer> {

}
