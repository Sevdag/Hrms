package com.Hrms.Hrms.apiController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hrms.Hrms.Business.Abstract.JobExperienceService;
import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Core.utilities.results.Result;
import com.Hrms.Hrms.Entities.Concrete.JobExperience;


@RestController
@RequestMapping("/api/jobexperience")
public class JobExperienceControllers {
	
	private JobExperienceService jobExperienceService;

	@Autowired
	public JobExperienceControllers(JobExperienceService jobExperienceService) {
		super();
		this.jobExperienceService = jobExperienceService;
	}

	@RequestMapping("/getall")

	public DataResult<List<JobExperience>> getall() {
		return this.jobExperienceService.getall();
	}
	
	@PostMapping("/add")
	public Result add(JobExperience jobExperience) {
		return this.jobExperienceService.add(jobExperience);
	}

}
