package com.Praveen.one_to_many.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	private String Pname;
	private String Pdiscription;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String pname, String pdiscription) {
		super();
		this.id = id;
		Pname = pname;
		Pdiscription = pdiscription;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getPdiscription() {
		return Pdiscription;
	}
	public void setPdiscription(String pdiscription) {
		Pdiscription = pdiscription;
	}
	
}
