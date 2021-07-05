package com.Hrms.Hrms.Business.Abstract;

import java.util.List;

import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Core.utilities.results.Result;
import com.Hrms.Hrms.Entities.Concrete.Candidate;
import com.Hrms.Hrms.Entities.Concrete.dtos.CandidateWithCvTable;

public interface CandidateService {
	DataResult<List<Candidate>> getall();
	Result add(Candidate candidate);
	

}
