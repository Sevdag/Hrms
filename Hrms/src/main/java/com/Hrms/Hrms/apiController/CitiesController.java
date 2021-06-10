package com.Hrms.Hrms.apiController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hrms.Hrms.Business.Abstract.CitiesService;
import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Entities.Concrete.Candidate;
import com.Hrms.Hrms.Entities.Concrete.Cities;

@RestController
@RequestMapping("/api/cities")
public class CitiesController {
	private CitiesService citiesService;

	@Autowired
	public CitiesController(CitiesService citiesService) {
		super();
		this.citiesService = citiesService;
	}
	
	@RequestMapping("/getall")
	DataResult<List<Cities>> getall(){
		return this.citiesService.getall();
	}

}
