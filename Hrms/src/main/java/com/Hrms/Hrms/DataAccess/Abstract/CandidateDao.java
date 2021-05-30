package com.Hrms.Hrms.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hrms.Hrms.Entities.Concrete.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer>{

	Candidate getByEmail(String email);
	Candidate getByNationaltyId(String nationaltyId);
}
