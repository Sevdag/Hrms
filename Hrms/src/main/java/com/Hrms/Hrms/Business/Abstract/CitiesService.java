package com.Hrms.Hrms.Business.Abstract;

import java.util.List;

import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Entities.Concrete.Cities;

public interface CitiesService {
DataResult<List<Cities>> getall();
}
