package com.Hrms.Hrms.DataAccess.Abstract;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Hrms.Hrms.Entities.Concrete.CvTable;
import com.Hrms.Hrms.Entities.Concrete.dtos.CandidateWithCvTable;

public interface CvTableDao extends JpaRepository<CvTable, Integer> {



}
