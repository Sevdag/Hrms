package com.Hrms.Hrms.DataAccess.Abstract;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Hrms.Hrms.Entities.Concrete.CvTable;
import com.Hrms.Hrms.Entities.Concrete.dtos.CandidateWithCvTable;

public interface CvTableDao extends JpaRepository<CvTable, Integer> {
	
	@Query("Select new com.Hrms.Hrms.Entities.Concrete.dtos.CandidateWithCvTable(c.id,c.firstName,c.lastName,cv.photo,cv.githubLink,cv.description,s.schoolName,s.department,"
			+ "s.startedDate,s.endDate,f.languageName,f.level,p.programmingLanguageName,je.companyName,je.position,je.startDate,je.jobEndDate) "
			+ "From CvTable cv Inner Join cv.candidate c Inner Join cv.schools s Inner Join cv.foreignLanguages f Inner Join cv.programmingLanguages p Inner Join"
			+ " cv.jobExperiences je where c.id=:id")
	List<CandidateWithCvTable> candidateWithCvTables(Integer id);



}
