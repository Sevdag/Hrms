package com.Hrms.Hrms.Business.Abstract;

import java.util.List;

import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Core.utilities.results.Result;
import com.Hrms.Hrms.Entities.Concrete.JobPosition;

public interface JobPositionService {
	
	Result add(JobPosition jobPosition);

	DataResult<List<JobPosition>> getall();
}
