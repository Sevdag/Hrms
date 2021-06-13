package com.Hrms.Hrms.Entities.Concrete;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="jobexperience")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class JobExperience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@NotBlank
	@Column(name="company_name")
	private String companyName;
	
	@NotBlank
	@Column(name="position")
	private String position;
	
	@NotBlank
	@Column(name="start_date")
	private LocalDate startDate;
	
	@Column(name="end_date")
	private LocalDate endDate;
	
	@ManyToOne
	@JsonIgnore
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

	

}
