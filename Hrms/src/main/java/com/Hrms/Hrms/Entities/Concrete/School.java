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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "schools")
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;

	@Column(name = "school_name")
	private String schoolName;

	@Column(name = "department")
	private String department;

	@Column(name = "started_date")
	private Date startedDate;

	@Column(name = "end_date")
	private Date endDate;
	
	@ManyToOne()
	@JoinColumn(name="cvTable_id")
	private CvTable cvTable;

}
