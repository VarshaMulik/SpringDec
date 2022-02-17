package com.psl.training.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.psl.training.model.Employee;

// get connected to db
@Repository
public class EmployeeDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public EmployeeDao() {
		
	
	}

	public Employee getEmployeeById(int id) {

		// hibernate will use session for performing db operations
		Session session = sessionFactory.openSession();
		return session.get(Employee.class, id);
	}

	public List<Employee> getAllEmployees() {
		Session session = sessionFactory.openSession();
		return session.createQuery("from Employee",Employee.class).list();


	}

	public boolean insertEmployee(Employee emp) {
		try {
		Session session=sessionFactory.openSession();
		session.beginTransaction(); // transaction started
		session.save(emp);
		session.getTransaction().commit();
		return true;
		}catch (Exception e) {
			throw e;
		}
	}

	public boolean updateEmployee(Employee emp) {
		try {
			Session session=sessionFactory.openSession();
			session.beginTransaction(); // transaction started
			session.save(emp);  // if record not present it will insert else it will update 
			session.getTransaction().commit();
			return true;
			}catch (Exception e) {
				throw e;
			}
	}

	public boolean deleteEmployee(int id) {
		Session session = sessionFactory.openSession();
		Employee e=session.get(Employee.class, id);
		if(e==null )
			throw new RuntimeException("Resource Not found");
		session.delete(e);
		return true;
	}
}
