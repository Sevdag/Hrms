package com.Hrms.Hrms.Business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hrms.Hrms.Business.Abstract.EmployerService;
import com.Hrms.Hrms.Core.utilities.Email.EmailService;
import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Core.utilities.results.ErrorResult;
import com.Hrms.Hrms.Core.utilities.results.Result;
import com.Hrms.Hrms.Core.utilities.results.SuccessDataResult;
import com.Hrms.Hrms.Core.utilities.results.SuccessResult;
import com.Hrms.Hrms.DataAccess.Abstract.EmployerDao;
import com.Hrms.Hrms.Entities.Concrete.Employer;

@Service

public class EmployerManager implements EmployerService {
	private EmployerDao employerDao;
	private EmailService emailService;

	@Autowired
	public EmployerManager(EmployerDao employerDao, EmailService emailService) {
		super();
		this.employerDao = employerDao;
		this.emailService = emailService;
	}

	@Override
	public DataResult<List<Employer>> getall() {

		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "Veriler listelendi");
	}

	@Override
	public Result add(Employer employer) {
		if (this.employerDao.getByEmail(employer.getEmail()) != null) {
			return new ErrorResult("DAha önce kayıtlı email var");
		}
		this.employerDao.save(employer);
		this.emailService.sendEmail(employer.getEmail(), "123465");
		return new SuccessResult("Eklendi");
	}

}
