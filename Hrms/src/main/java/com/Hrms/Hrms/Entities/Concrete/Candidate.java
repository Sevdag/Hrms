package com.Hrms.Hrms.Entities.Concrete;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Candidates")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Candidate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "nationaltyId")
	private String nationaltyId;

	@Column(name = "dateOfBirth", columnDefinition = "Default LocalDate CURRENT_STATE ")
	private LocalDate dateOfBirth=LocalDate.now();

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "passwordAgain")
	private String passWordAgain;
}
