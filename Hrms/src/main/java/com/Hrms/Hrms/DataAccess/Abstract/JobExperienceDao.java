package com.Hrms.Hrms.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hrms.Hrms.Entities.Concrete.JobExperience;

public interface JobExperienceDao extends JpaRepository<JobExperience, Integer> {

}
