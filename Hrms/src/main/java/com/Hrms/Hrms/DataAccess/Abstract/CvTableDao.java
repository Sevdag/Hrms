package com.Hrms.Hrms.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hrms.Hrms.Entities.Concrete.CvTable;

public interface CvTableDao extends JpaRepository<CvTable, Integer> {
	

}
