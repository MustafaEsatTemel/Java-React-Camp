package me.mustafaesattemel.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.mustafaesattemel.business.abstracts.JobService;
import me.mustafaesattemel.dataAccess.abstracts.JobDao;
import me.mustafaesattemel.entities.concretes.Job;

@Service
public class JobManager implements JobService{

	private JobDao jobDao;
	
	@Autowired
	public JobManager(JobDao jobdao) {
		this.jobDao=jobdao;
	}
	
	@Override
	public List<Job> getAll() {
		return jobDao.findAll();
	}

	
	
}
