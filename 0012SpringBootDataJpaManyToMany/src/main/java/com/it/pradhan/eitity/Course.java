package com.it.pradhan.eitity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Course {
	
	@Id
	@Column(name="cid")
	private Integer courseId;
	@Column(name="cname")
	private String courseName;
	@Column(name="cfee")
	private Double courseFee;

}
