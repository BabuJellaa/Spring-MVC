package com.spring.company.config;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public void addEmployee(Employee employee) {
		employeeDao.insertEmployeeDetails(employee);
	}

	@Override
	public void updateEmployeeDetails(Employee employee) {
		employeeDao.updateEmployeeDetails(employee);
	}

	@Override
	public void removeEmployee(int employeeId) {
		employeeDao.deleteEmployee(employeeId);
	}

	@Override
	public Employee fetchEmployeeById(int employeeId) {
		return employeeDao.getEmployeeDetailsByEmployeeId(employeeId);
	}

	@Override
	public List<Employee> retrieveAllEmployees() {
		return employeeDao.getAllEmployees();
	}
	
}
