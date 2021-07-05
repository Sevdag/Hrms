package com.Hrms.Hrms.Business.Abstract;

import java.util.List;

import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Core.utilities.results.Result;
import com.Hrms.Hrms.Entities.Concrete.CvTable;
import com.Hrms.Hrms.Entities.Concrete.dtos.CandidateWithCvTable;

public interface CvTableService {
Result add(CvTable cvTable);
DataResult <List<CvTable>> getAll();
}
