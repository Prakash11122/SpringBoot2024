package com.it.pradhan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="depttab")
public class Department {
	
	@Id
	@Column(name="did")
	private Integer deptId;
	@Column(name="dname")
	private String deptName;
	@Column(name="dadmin")
	private String deptAdmin;

}
