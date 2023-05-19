package com.Praveen.one_to_many.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "book", cascade = CascadeType.ALL)
private int id;
private String Testname;
private String Testdiscription;

public Category() {
	super();
	// TODO Auto-generated constructor stub
}
public Category(int id, String testname, String testdiscription) {
	super();
	this.id = id;
	Testname = testname;
	Testdiscription = testdiscription;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTestname() {
	return Testname;
}
public void setTestname(String testname) {
	Testname = testname;
}
public String getTestdiscription() {
	return Testdiscription;
}
public void setTestdiscription(String testdiscription) {
	Testdiscription = testdiscription;
}


}
