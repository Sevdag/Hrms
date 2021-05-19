package com.Hrms.Hrms.apiController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hrms.Hrms.Business.Abstract.JobService;
import com.Hrms.Hrms.Entities.Concrete.Job;

@RestController
@RequestMapping("/api/job")
public class JobControllers {
	private JobService jobService;

	@Autowired
	public JobControllers(JobService jobService) {
		this.jobService = jobService;
	}

	
	@GetMapping("/getall")
	List<Job> getall(){
		return  this.jobService.getAll();
	}
}
