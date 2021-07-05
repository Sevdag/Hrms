package com.Hrms.Hrms.Entities.Concrete.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateWithCvTable {
	private int id;
	private String firstName;
	private String lastName;
	private String photoLink;
	private String githubLink;
	private String description;
	private String schoolName;
	private String department;
	private Date startedDate;
	private Date endDate;
	private String languageName;
	private int level;
	private String programmingLanguageName;
	private String companyName;
	private String position;
	private Date startDate;
	private Date jobEndDate;

}
