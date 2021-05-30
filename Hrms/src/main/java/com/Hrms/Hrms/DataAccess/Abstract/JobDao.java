package com.Hrms.Hrms.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hrms.Hrms.Entities.Concrete.Job;

public interface JobDao extends JpaRepository<Job, Integer> {
	Job getByJobName(String jobName);

}
