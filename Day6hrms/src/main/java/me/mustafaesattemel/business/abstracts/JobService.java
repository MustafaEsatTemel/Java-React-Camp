package me.mustafaesattemel.business.abstracts;

import java.util.List;

import me.mustafaesattemel.entities.concretes.Job;

public interface JobService {

	List<Job> getAll();
}
