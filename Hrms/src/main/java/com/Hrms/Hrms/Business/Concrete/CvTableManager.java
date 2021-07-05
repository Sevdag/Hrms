package com.Hrms.Hrms.Business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hrms.Hrms.Business.Abstract.CvTableService;
import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Core.utilities.results.Result;
import com.Hrms.Hrms.Core.utilities.results.SuccessDataResult;
import com.Hrms.Hrms.Core.utilities.results.SuccessResult;
import com.Hrms.Hrms.DataAccess.Abstract.CvTableDao;
import com.Hrms.Hrms.Entities.Concrete.CvTable;
import com.Hrms.Hrms.Entities.Concrete.dtos.CandidateWithCvTable;
@Service
public class CvTableManager implements CvTableService {

	private CvTableDao cvTableDao;
	
	@Autowired
	public CvTableManager(CvTableDao cvTableDao) {
		super();
		this.cvTableDao = cvTableDao;
	}

	@Override
	public Result add(CvTable cvTable) {
		this.cvTableDao.save(cvTable);
		return new SuccessResult("Eklendi");
	}

	@Override
	public DataResult<List<CvTable>> getAll() {
		
		return new SuccessDataResult<List<CvTable>>(this.cvTableDao.findAll(),"Listelendi");
	}
	@Override
	public DataResult<List<CandidateWithCvTable>> candidateWithCvTables(Integer id) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<CandidateWithCvTable>>(this.cvTableDao.candidateWithCvTables(id));
	}


	
	

}
