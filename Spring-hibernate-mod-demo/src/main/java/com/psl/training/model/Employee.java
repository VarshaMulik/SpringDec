package com.psl.training.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // declaring this is Java object related with RDBMS table
@Table(name="employee_details")  /// mapping table with Java Object (Optional if table name is matching with class name
public class Employee {

	@Id // declaring primary key field - mandatory for entity class
	@GeneratedValue(strategy = GenerationType.IDENTITY) // for generating primary key values automatically this is optional
	private int empid;
	private String empname;
	private String city;
	private Date joindate;
	

	public Employee() {
		// TODO Auto-generated constructor stub
	}



	public Employee(String empname, String city, Date joindate) {
		super();
		this.empname = empname;
		this.city = city;
		this.joindate = joindate;
	}



	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getJoindate() {
		return joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", city=" + city + ", joindate=" + joindate + "]";
	}

	
	
	

}
