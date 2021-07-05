package com.Hrms.Hrms.apiController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hrms.Hrms.Business.Abstract.CandidateService;
import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Core.utilities.results.Result;
import com.Hrms.Hrms.Entities.Concrete.Candidate;
import com.Hrms.Hrms.Entities.Concrete.dtos.CandidateWithCvTable;

@RestController
@RequestMapping("/api/candidatescontrollers")
public class CandidateControllers {
	private CandidateService candidateService;

	@Autowired
	public CandidateControllers(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	
	@RequestMapping("/getall")
	public DataResult<List<Candidate>> getall(){
		return this.candidateService.getall();
	}
	@PostMapping("/add")
	
	public Result add(Candidate candidate) {
		return this.candidateService.add(candidate);
	}
	
	

}
