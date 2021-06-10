package com.Hrms.Hrms.Entities.Concrete;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity 
@Table(name = "employers")
@PrimaryKeyJoinColumn(name = "user_id")
public class Employer extends User{

	@Column(name = "companyName",nullable = false)
	private String companyName;

	@Column(name = "website",nullable =  false)
	private String website;


	@Column(name = "phoneNumber",nullable =  false)
	private String phoneNumber;
	
	
	@ManyToOne()
	@JoinColumn(name = "cities_id")
	private Cities cities;
	
	@OneToMany(mappedBy = "employer")
	List<JobPosting> jobPostings;
}
	
