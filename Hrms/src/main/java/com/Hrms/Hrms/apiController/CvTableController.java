package com.Hrms.Hrms.apiController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hrms.Hrms.Business.Abstract.CvTableService;
import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Core.utilities.results.Result;
import com.Hrms.Hrms.Entities.Concrete.CvTable;
import com.Hrms.Hrms.Entities.Concrete.dtos.CandidateWithCvTable;

@RestController
@RequestMapping("/api/cvTable")

public class CvTableController {

	private CvTableService cvTableService;

	@Autowired
	public CvTableController(CvTableService cvTableService) {
		super();
		this.cvTableService = cvTableService;
	}
	
	@PostMapping("/add")
	public Result add(CvTable cvTable)
	{
		return this.cvTableService.add(cvTable);
		
	}
	@RequestMapping("/getall")
	public DataResult <List<CvTable>> getAll(){
		return this.cvTableService.getAll();
	}
	
	
}
