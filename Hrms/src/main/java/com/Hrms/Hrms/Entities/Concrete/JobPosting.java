package com.Hrms.Hrms.Entities.Concrete;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

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

	@Column(name = "open_position",nullable = false)
	private int openPosition;
	
	@Column(name="deadline")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date deadline;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@Column(name = "publish_date")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "dd/MM/yyyy")
	private Date publishDate;
	
	@Column(name = "end_of_publish_date")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "dd/MM/yyyy")
	private Date endOfPublishDate;
	
	
	
	@ManyToOne()
	@JoinColumn(name = "cities_id")
	private Cities cities;
	
	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private Employer employer;
	
	@ManyToOne()
	@JoinColumn(name = "jobPosition_id")
	private JobPosition jobPosition;
}
