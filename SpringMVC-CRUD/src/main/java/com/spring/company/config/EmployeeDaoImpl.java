package com.spring.company.config;

import java.util.List;
 
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Override
	public int insertEmployeeDetails(Employee employee) {
		System.out.println("Employee details ,,"+employee.getEmployeeId()+employee.getEmployeeName()+employee.getEmployeeRole());
		int details=(int) hibernateTemplate.save(employee);
		System.out.println("Details.."+details);
		System.out.println("Inserted into DB Successfully..!!");	
		return details;
	}

	@Override
	public void updateEmployeeDetails(Employee employee) {
		hibernateTemplate.update(employee);
	}

	@Override
	public Employee getEmployeeDetailsByEmployeeId(int employeeId) {
		Employee employee=hibernateTemplate.get(Employee.class, employeeId);
		System.out.println("Employee ID from Dao implementation class : "+employee.getEmployeeId());
		return employee;
	}

	@Override
	public void deleteEmployee(int employeeId) {
		Employee employee=hibernateTemplate.get(Employee.class, employeeId);
		hibernateTemplate.delete(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees=hibernateTemplate.loadAll(Employee.class);
		for(Employee employee : employees) {
			System.out.println("Babu..."+employee.getEmployeeId()+" "+employee.getEmployeeName()+" "+employee.getEmployeeRole());
		}
		return employees;
	}

}
