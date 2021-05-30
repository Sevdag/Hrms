package com.Hrms.Hrms.Core.utilities.userCheck;

import java.time.LocalDate;

public interface UserCheckService {
	public boolean isVerified(String nationaltyId, String name, String lastName, LocalDate dateOfBirth);

}
