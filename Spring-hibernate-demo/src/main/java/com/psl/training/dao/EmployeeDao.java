package com.psl.training.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.psl.training.model.Employee;
// get connected to db
@Repository
public class EmployeeDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	

public	Employee getEmployeeById(int id) {
		String qry="select * from employee where empid=?";
		
		// this method will return single object
		return jdbcTemplate.queryForObject(qry, new BeanPropertyRowMapper<Employee>(Employee.class),id);
		
	}
	
public	List<Employee> getAllEmployees(){
	String qry="select * from employee";
	
	// this method will return single object
	return jdbcTemplate.query(qry, new BeanPropertyRowMapper<Employee>(Employee.class));
	}
	
public	boolean insertEmployee(Employee emp){
		try{
		String qry="insert into employee values(?,?,?)";
		jdbcTemplate.update(qry,emp.getEmpid(),emp.getEmpname(),emp.getCity());
		return true;
		}catch (Exception e) {
			//log an exception
		}
		return false;
	}
	
public	boolean updateEmployee(Employee emp){
		return false;
		
	}
public	boolean deleteEmployee(int empid){
		return false;
		
	}
}
