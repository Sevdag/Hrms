package com.Hrms.Hrms.Entities.Concrete.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployerWithJobPostingDto {
	private int id;
	private String companyName;
	private String jobnName;
	private boolean isActive;
	private int openPosition;
	private Date publishDate;
	private Date endOfPublishDate;

}
