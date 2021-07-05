package com.Hrms.Hrms.DataAccess.Abstract;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Hrms.Hrms.Entities.Concrete.JobPosting;
import com.Hrms.Hrms.Entities.Concrete.dtos.EmployerWithJobPostingDto;

public interface JobPostingDao extends JpaRepository<JobPosting, Integer> {
	@Query("Select new com.Hrms.Hrms.Entities.Concrete.dtos.EmployerWithJobPostingDto(j.id,"
			+ "e.companyName,jb.jobName,j.isActive,j.openPosition,j.publishDate,j.endOfPublishDate)"
			+ " From JobPosting j Inner Join j.employer e Inner Join j.jobPosition jb where j.isActive=true")
	List<EmployerWithJobPostingDto> getAllActivedJob();
	
	@Query("Select new com.Hrms.Hrms.Entities.Concrete.dtos.EmployerWithJobPostingDto(j.id,"
			+ "e.companyName,jb.jobName,j.isActive,j.openPosition,j.publishDate,j.endOfPublishDate)"
			+ " From JobPosting j Inner Join j.employer e Inner Join j.jobPosition jb where j.isActive=true order by j.publishDate desc")
	List<EmployerWithJobPostingDto> getAllPublishDate();
	
	@Query("Select new com.Hrms.Hrms.Entities.Concrete.dtos.EmployerWithJobPostingDto(j.id,"
			+ "e.companyName,jb.jobName,j.isActive,j.openPosition,j.publishDate,j.endOfPublishDate)"
			+ " From JobPosting j Inner Join j.employer e Inner Join j.jobPosition jb where j.isActive=true and e.companyName=:companyName ")
	List<EmployerWithJobPostingDto> getCompany(String companyName);
	

}
