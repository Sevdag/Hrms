package com.Hrms.Hrms.Business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hrms.Hrms.Business.Abstract.CitiesService;
import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Core.utilities.results.SuccessDataResult;
import com.Hrms.Hrms.DataAccess.Abstract.CitiesDao;
import com.Hrms.Hrms.Entities.Concrete.Cities;

@Service
public class CitiesManager implements CitiesService{
	private CitiesDao citiesDao;
	

	
	@Autowired
	public CitiesManager(CitiesDao citiesDao) {
		super();
		this.citiesDao = citiesDao;
	}




	@Override
	public DataResult<List<Cities>> getall() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Cities>>(this.citiesDao.findAll());
	}
}
