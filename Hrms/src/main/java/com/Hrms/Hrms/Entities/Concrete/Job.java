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
@Table(name = "job")
@AllArgsConstructor
@NoArgsConstructor

public class Job {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "id",nullable = false)
	private int id;
	
	@Column(name = "job_name",nullable = false)
	private String jobName;
	
	
	
}
