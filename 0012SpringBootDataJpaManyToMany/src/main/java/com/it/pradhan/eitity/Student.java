package com.it.pradhan.eitity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="stdtable")
public class Student {
	
	@Id
	@Column(name="sid")
	private Integer stdId;
	@Column(name="sname")
	private String stdName;
	@Column(name="smail")
	private String stdMail;
	
	
	@ManyToMany
	@JoinTable(
			name="stdcrstab",
			joinColumns = @JoinColumn(name="sidFk"),
			inverseJoinColumns = @JoinColumn(name="cidFk")
			)
	private List<Course> cobs;

}
