package com.Hrms.Hrms.Business.Abstract;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Core.utilities.results.Result;
import com.Hrms.Hrms.Entities.Concrete.JobPosting;

public interface JobPostingService {
	Result add(JobPosting jobPosting);

	DataResult<List<JobPosting>> getall();

	DataResult<List<JobPosting>> getAllSorted();

}
