package com.Hrms.Hrms.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hrms.Hrms.Entities.Concrete.JobPosting;

public interface JobPostingDao extends JpaRepository<JobPosting, Integer> {

}
