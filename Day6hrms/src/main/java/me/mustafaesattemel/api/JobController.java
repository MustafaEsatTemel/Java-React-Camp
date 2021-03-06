package me.mustafaesattemel.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.mustafaesattemel.business.abstracts.JobService;
import me.mustafaesattemel.entities.concretes.Job;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

	private JobService jobService;
	
	@Autowired
	public JobController(JobService jobService) {
		this.jobService=jobService;
	}
	
	@GetMapping("/getAll")
	public List<Job> getAll(){
		return this.jobService.getAll();
	}
}
