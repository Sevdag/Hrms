package com.Hrms.Hrms.apiController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hrms.Hrms.Business.Abstract.JobPositionService;
import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Core.utilities.results.Result;
import com.Hrms.Hrms.Entities.Concrete.JobPosition;

@RestController
@RequestMapping(name = "/api/jobposition")

public class JobPositionControllers {
	private JobPositionService jobPositionService;

	@Autowired
	public JobPositionControllers(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}

	@RequestMapping("/getall")
	public DataResult<List<JobPosition>> getall() {
		return this.jobPositionService.getall();
	}

	@PostMapping("/add")
	public Result add(@RequestBody JobPosition jobPosition) {
		return this.jobPositionService.add(jobPosition);
	}
}
