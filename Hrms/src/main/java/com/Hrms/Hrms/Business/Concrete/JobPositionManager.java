package com.Hrms.Hrms.Business.Concrete;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hrms.Hrms.Business.Abstract.JobPositionService;
import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Core.utilities.results.Result;
import com.Hrms.Hrms.Core.utilities.results.SuccessDataResult;
import com.Hrms.Hrms.DataAccess.Abstract.JobPositionDao;
import com.Hrms.Hrms.Entities.Concrete.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public Result add(JobPosition jobPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobPosition>> getall() {
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"İş pozisyonları listelendi");
	}
	
}
