package com.it.pradhan.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="productGenerator")
public class Product {
	@Id
	@GeneratedValue(generator = "test")
	@GenericGenerator(name="test",strategy = "com.it.pradhan.gen.MyCustomGen")
	@Column(name="pid")
	private String prodId;
	
	@Column(name="pname")
	private String prodName;
	
	@Column(name="pcost")
	private Double prodCost;

}
