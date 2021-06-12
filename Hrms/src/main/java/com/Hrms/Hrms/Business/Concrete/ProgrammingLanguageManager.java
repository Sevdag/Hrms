package com.Hrms.Hrms.Business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Hrms.Hrms.Business.Abstract.ProgrammingLanguageService;
import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Core.utilities.results.Result;
import com.Hrms.Hrms.Core.utilities.results.SuccessDataResult;
import com.Hrms.Hrms.Core.utilities.results.SuccessResult;
import com.Hrms.Hrms.DataAccess.Abstract.ProgrammingLanguageDao;
import com.Hrms.Hrms.Entities.Concrete.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{

	private ProgrammingLanguageDao programmingLanguageDao;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageDao programmingLanguageDao) {
		super();
		this.programmingLanguageDao = programmingLanguageDao;
	}

	@Override
	public Result add(ProgrammingLanguage programmingLanguage) {

		this.programmingLanguageDao.save(programmingLanguage);
		return new SuccessResult("Eklendi");
	}

	@Override
	public DataResult<List<ProgrammingLanguage>> getall() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<ProgrammingLanguage>>(this.programmingLanguageDao.findAll(),"Listelendi");
	}

}
