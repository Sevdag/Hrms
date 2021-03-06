package com.Hrms.Hrms.Business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hrms.Hrms.Business.Abstract.UserService;
import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Core.utilities.results.ErrorResult;
import com.Hrms.Hrms.Core.utilities.results.Result;
import com.Hrms.Hrms.Core.utilities.results.SuccessDataResult;
import com.Hrms.Hrms.Core.utilities.results.SuccessResult;
import com.Hrms.Hrms.DataAccess.Abstract.UserDao;
import com.Hrms.Hrms.Entities.Concrete.User;

@Service
public class UserManager implements UserService {
	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {

		if (this.findByEmail(user.getEmail()) != null) {
			return new ErrorResult("Aynı Email Var");
		}

		this.userDao.save(user);
		return new SuccessResult("Eklendi");
	}

	@Override
	public DataResult<List<User>> getall() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll(), "Listelendi");
	}

	@Override
	public User findByEmail(String email) {
		return this.userDao.findByEmail(email);

	}

}
