package com.Hrms.Hrms.DataAccess.Abstract;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Hrms.Hrms.Entities.Concrete.Candidate;
import com.Hrms.Hrms.Entities.Concrete.dtos.CandidateWithCvTable;

public interface CandidateDao extends JpaRepository<Candidate, Integer>{

	Candidate getByEmail(String email);
	Candidate getByNationaltyId(String nationaltyId);
	
	
	
}
