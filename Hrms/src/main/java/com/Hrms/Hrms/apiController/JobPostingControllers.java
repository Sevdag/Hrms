package com.Hrms.Hrms.apiController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hrms.Hrms.Business.Abstract.JobPostingService;
import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Core.utilities.results.Result;
import com.Hrms.Hrms.Entities.Concrete.JobPosting;
import com.Hrms.Hrms.Entities.Concrete.dtos.EmployerWithJobPostingDto;

@RestController
@RequestMapping("/api/jobposting")
public class JobPostingControllers {
	private JobPostingService jobPostingService;

	@Autowired
	public JobPostingControllers(JobPostingService jobPostingService) {
		super();
		this.jobPostingService = jobPostingService;
	}

	@RequestMapping("/getall")
	public DataResult<List<JobPosting>> getall() {
		return this.jobPostingService.getall();
	}

	@PostMapping("/add")
	public Result add(JobPosting jobPosting) {
		return this.jobPostingService.add(jobPosting);
	}

	@RequestMapping("/getAllPublishDate")
	public DataResult<List<EmployerWithJobPostingDto>> getAllPublishDate(){
		return this.jobPostingService.getAllPublishDate();
	}

	@RequestMapping("/getAllActivedJob")
	public DataResult<List<EmployerWithJobPostingDto>> getAllActivedJob() {
		return this.jobPostingService.getAllActivedJob();
	}
	
	
	@RequestMapping("/getCompany")
	public DataResult<List<EmployerWithJobPostingDto>> getCompany(String companyName){
		return this.jobPostingService.getCompany(companyName);
	}

}
