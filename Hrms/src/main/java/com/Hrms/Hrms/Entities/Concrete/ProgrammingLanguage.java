package com.Hrms.Hrms.Entities.Concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "programming_language")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgrammingLanguage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "language_name")
	private String languageName;
	
	@ManyToOne()
	@JoinColumn(name = "cvTable_id")
	private CvTable cvTable;
	
	
}
