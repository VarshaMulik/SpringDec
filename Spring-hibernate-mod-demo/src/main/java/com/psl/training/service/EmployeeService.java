package com.psl.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.training.dao.EmployeeDao;
import com.psl.training.model.Employee;


// interact with dao layer
// may handle transactions
@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao dao;
	
	public	Employee getEmployeeById(int id) {
		return dao.getEmployeeById(id);	
	}
	
	public	List<Employee> getAllEmployees(){
		return dao.getAllEmployees();
	}
	
	public	boolean insertEmployee(Employee emp){
		return dao.insertEmployee(emp);
	}
	
	public boolean updateEmployee(Employee emp){
		return false;
		
	}
	public boolean deleteEmployee(int empid){
		return false;
		
	}

}
