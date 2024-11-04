package com.it.pradhan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="studentDetails")
public class Student {
	
	@Id
	@Column(name="sid")
	private Integer studentId;
	@Column(name="sname")
	private String studentName;
	@Column(name="sfee")
	private Double studentFee;

}
