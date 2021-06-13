package com.Hrms.Hrms.Business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.Hrms.Hrms.Business.Abstract.JobPostingService;
import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Core.utilities.results.Result;
import com.Hrms.Hrms.Core.utilities.results.SuccessDataResult;
import com.Hrms.Hrms.Core.utilities.results.SuccessResult;
import com.Hrms.Hrms.DataAccess.Abstract.JobPostingDao;
import com.Hrms.Hrms.Entities.Concrete.JobPosting;

@Service
public class JobPostingManager implements JobPostingService{
	private JobPostingDao jobPostingDao;

	@Autowired
	public JobPostingManager(JobPostingDao jobPostingDao) {
		super();
		this.jobPostingDao = jobPostingDao;
	}

	@Override
	public Result add(JobPosting jobPosting) {
		this.jobPostingDao.save(jobPosting);
		
		return new SuccessResult("Eklendi");
	}

	@Override
	public DataResult<List<JobPosting>> getall() {
		
		return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.findAll());
	}

	@Override
	public DataResult<List<JobPosting>> getAllSorted() {
		
			Sort sort = Sort.by(Sort.Direction.DESC,"openPosition");
			return new SuccessDataResult<List<JobPosting>>
			(this.jobPostingDao.findAll(sort),"Başarılı");
		
	}

}
