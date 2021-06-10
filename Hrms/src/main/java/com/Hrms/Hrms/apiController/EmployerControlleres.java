package com.Hrms.Hrms.apiController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hrms.Hrms.Business.Abstract.EmployerService;
import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Core.utilities.results.Result;
import com.Hrms.Hrms.Entities.Concrete.Employer;

@RestController
@RequestMapping("/api/employer")
public class EmployerControlleres {
	private EmployerService employerService;

	@Autowired
	public EmployerControlleres(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}

	@RequestMapping("/getall")
	public DataResult<List<Employer>> getall() {
		return this.employerService.getall();
	}

	@PostMapping("/add")
	public Result add(Employer employer) {
		return this.employerService.add(employer);
	}
}
