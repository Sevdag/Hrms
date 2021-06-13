package com.Hrms.Hrms.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hrms.Hrms.Entities.Concrete.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {

}
