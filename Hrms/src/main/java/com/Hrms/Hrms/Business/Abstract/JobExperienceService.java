package com.Hrms.Hrms.Business.Abstract;

import java.util.List;

import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Core.utilities.results.Result;
import com.Hrms.Hrms.Entities.Concrete.JobExperience;


public interface JobExperienceService {
	Result add(JobExperience jobExperience);

	DataResult<List<JobExperience>> getall();
}
