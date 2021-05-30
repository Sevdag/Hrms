package com.Hrms.Hrms.Business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hrms.Hrms.Business.Abstract.CandidateService;
import com.Hrms.Hrms.Core.utilities.Email.EmailService;
import com.Hrms.Hrms.Core.utilities.results.DataResult;
import com.Hrms.Hrms.Core.utilities.results.ErrorResult;
import com.Hrms.Hrms.Core.utilities.results.Result;
import com.Hrms.Hrms.Core.utilities.results.SuccessDataResult;
import com.Hrms.Hrms.Core.utilities.results.SuccessResult;
import com.Hrms.Hrms.Core.utilities.userCheck.UserCheckService;
import com.Hrms.Hrms.DataAccess.Abstract.CandidateDao;
import com.Hrms.Hrms.Entities.Concrete.Candidate;

@Service
public class CandidateManager implements CandidateService {
	private CandidateDao candidateDao;
	private UserCheckService userCheckService;
	private EmailService emailServcie;

	@Autowired
	public CandidateManager(CandidateDao candidateDao, UserCheckService userCheckService, EmailService emailServcie) {
		// TODO Auto-generated constructor stub
		this.candidateDao = candidateDao;
		this.emailServcie = emailServcie;
		this.userCheckService = userCheckService;
	}

	@Override
	public DataResult<List<Candidate>> getall() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll());
	}

	@Override
	public Result add(Candidate candidate) {
		if (!this.userCheckService.isVerified(candidate.getNationaltyId(), candidate.getFirstName(),
				candidate.getLastName(), candidate.getDateOfBirth())) {
			return new ErrorResult("Doğrulama Başarısız");
		}
		if (this.candidateDao.getByEmail(candidate.getEmail()) != null
				&& this.candidateDao.getByNationaltyId(candidate.getNationaltyId()) != null) {
			return new ErrorResult("Aynı email veya tcye sahip kullanıcı varr");

		}
		this.emailServcie.sendEmail(candidate.getEmail(), "124542");
		this.candidateDao.save(candidate);
		return new SuccessResult("Kaydedildi");
	}

}
