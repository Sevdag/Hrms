package com.Hrms.Hrms.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hrms.Hrms.Entities.Concrete.Cities;

public interface CitiesDao extends  JpaRepository<Cities, Integer>{

}
