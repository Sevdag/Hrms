package com.Hrms.Hrms.Business.Abstract;

import java.util.List;

import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Core.utilities.results.Result;
import com.Hrms.Hrms.Entities.Concrete.User;


public interface UserService {
	Result add(User user);
	DataResult<List<User>> getall();
	User findByEmail(String email);
}
