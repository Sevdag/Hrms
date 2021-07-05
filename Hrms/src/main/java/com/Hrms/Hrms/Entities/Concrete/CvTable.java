package com.Hrms.Hrms.Entities.Concrete;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cv_table")
public class CvTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "photo")
	private String photo;

	@Column(name = "github_link")
	private String githubLink;

	@Column(name = "description")
	private String description;

	@Column(name = "linked_in_link")
	private String linkedInLink;
	
	@ManyToOne()
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
	
	@OneToMany(mappedBy = "cvTable")
	private List<School>schools;
	
	@OneToMany(mappedBy = "cvTable")
	private List<ForeignLanguage> foreignLanguages;
	
	@OneToMany(mappedBy = "cvTable")
	private List<ProgrammingLanguage> programmingLanguages;
	
	
	@OneToMany(mappedBy = "cvTable")
	private List<JobExperience> jobExperiences;

}
