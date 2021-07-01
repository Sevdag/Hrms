package com.Hrms.Hrms.DataAccess.Abstract;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hrms.Hrms.Entities.Concrete.User;

public interface UserDao extends JpaRepository<User, Integer>{
 User findByEmail(String email);
		
}
