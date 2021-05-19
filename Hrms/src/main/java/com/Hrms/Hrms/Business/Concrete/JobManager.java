package com.Hrms.Hrms.Business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hrms.Hrms.Business.Abstract.JobService;
import com.Hrms.Hrms.DataAccess.Abstract.JobDao;
import com.Hrms.Hrms.Entities.Concrete.Job;
@Service

public class JobManager implements JobService {
	
	private JobDao jobDao;
	
	
	@Autowired
	
	public JobManager(JobDao jobDao) {
		this.jobDao=jobDao;
	}

	@Override
	public List<Job> getAll() {
		
		return this.jobDao.findAll();
	}

}
