package com.Hrms.Hrms.Entities.Concrete;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "candidates")
@Data
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id")
public class Candidate extends User {

	@Column(name = "first_name", nullable = false)
	@NotBlank()
	@NotEmpty()
	private String firstName;

	@Column(name = "last_name", nullable = false)
	@NotBlank()
	@NotEmpty()
	private String lastName;
	
	@Column(name = "nationalty_id",nullable = false)
	@NotBlank()
	@NotEmpty()
	@Size(max = 11)
	private String nationaltyId;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name = "date_of_birth",nullable = false)
	@NotBlank()
	@NotEmpty()
	private Date dateOfBirth;
	
	@OneToMany(mappedBy = "candidate")
	@NotBlank()
	@NotEmpty()
	private List<CvTable> cvTables;
}
