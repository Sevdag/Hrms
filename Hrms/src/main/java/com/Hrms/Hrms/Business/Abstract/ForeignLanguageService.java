package com.Hrms.Hrms.Business.Abstract;


import java.util.List;

import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Core.utilities.results.Result;
import com.Hrms.Hrms.Entities.Concrete.ForeignLanguage;

public interface ForeignLanguageService {
	Result add(ForeignLanguage foreignLanguage);
	
	DataResult<List<ForeignLanguage>> getall();
	

}
