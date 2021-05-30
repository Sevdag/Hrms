package com.Hrms.Hrms.Business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hrms.Hrms.Business.Abstract.JobService;
import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Core.utilities.results.ErrorResult;
import com.Hrms.Hrms.Core.utilities.results.Result;
import com.Hrms.Hrms.Core.utilities.results.SuccessDataResult;
import com.Hrms.Hrms.Core.utilities.results.SuccessResult;
import com.Hrms.Hrms.DataAccess.Abstract.JobDao;
import com.Hrms.Hrms.Entities.Concrete.Job;

@Service
public class JobManager implements JobService {
	
	private JobDao jobDao;
	
	
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao=jobDao;
	}

	@Override
	public DataResult<List<Job>> getAll() {
		
		return  new SuccessDataResult<List<Job>>(this.jobDao.findAll(),
				"Data listelendi");
				
	}

	@Override
	public Result add(Job job) {
		if (this.jobDao.getByJobName(job.getJobName())!=null) {
			return new ErrorResult("Aynı isim de iş var");
		}
		this.jobDao.save(job);
		return new SuccessResult("Ürün eklendi");
	}

}
