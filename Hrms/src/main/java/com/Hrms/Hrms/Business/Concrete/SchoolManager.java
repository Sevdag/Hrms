package com.Hrms.Hrms.Business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hrms.Hrms.Business.Abstract.SchoolService;
import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Core.utilities.results.Result;
import com.Hrms.Hrms.Core.utilities.results.SuccessDataResult;
import com.Hrms.Hrms.Core.utilities.results.SuccessResult;
import com.Hrms.Hrms.DataAccess.Abstract.SchoolDao;
import com.Hrms.Hrms.Entities.Concrete.School;
@Service
public class SchoolManager implements SchoolService {

	private SchoolDao schoolDao;
	
	@Autowired
	public SchoolManager(SchoolDao schoolDao) {
		super();
		this.schoolDao = schoolDao;
	}

	@Override
	public Result add(School school) {
		this.schoolDao.save(school);
		return new SuccessResult("Okul eklendi");
	}

	@Override
	public DataResult<List<School>> getall() {
		
		return new SuccessDataResult<List<School>>(this.schoolDao.findAll(), "Listelendi");
	}

	
}
