package com.Hrms.Hrms.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hrms.Hrms.Entities.Concrete.School;

public interface SchoolDao extends JpaRepository<School, Integer> {

}
