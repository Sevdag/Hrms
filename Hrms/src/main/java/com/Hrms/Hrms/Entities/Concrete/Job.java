package com.Hrms.Hrms.Entities.Concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Job")
@AllArgsConstructor
@NoArgsConstructor

public class Job {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "jobName")
	private String jobName;
	
	@Column(name = "jobDetails")
	private String jobDetails;
	
	@Column(name = "isActive")
	private boolean isActive;
	
	@Column(name = "minSalary")
	private int minSalary;
	
	@Column(name = "maxSalary")
	private int maxSalary;
	
}
