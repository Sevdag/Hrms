package com.Hrms.Hrms.Core.utilities.userCheck;

import java.time.LocalDate;
import java.util.Date;

public interface UserCheckService {
	public boolean isVerified(String nationaltyId, String name, String lastName, Date dateOfBirth);

}
