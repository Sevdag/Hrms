package com.Hrms.Hrms.Entities.Concrete;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "job_posting")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPosting {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	
	@Column(name = "description",nullable = false)
	private String descrption;
	
	@Column(name = "min_salary")
	private int minSalary;
	
	@Column(name = "max_salary")
	private int maxSalary;

	@Column(name = "open_position")
	private int openPosition;
	
	@Column(name="deadline")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date deadline;
	
	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private Employer employer;
}
