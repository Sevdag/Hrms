package com.Hrms.Hrms.Core.utilities.userCheck;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.Hrms.Hrms.Mernis.FakeMernis;
@Service
public class UserCheckManager implements UserCheckService {

	@Override
	public boolean isVerified(String nationaltyId, String name, String lastName, LocalDate dateOfBirth) {
		FakeMernis fakeMernis = new FakeMernis();
		return fakeMernis.isVerified(nationaltyId, name, lastName, dateOfBirth);

	}

}
