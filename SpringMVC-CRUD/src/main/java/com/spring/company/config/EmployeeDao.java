package com.spring.company.config;

import java.util.List;

public interface EmployeeDao{
	public int insertEmployeeDetails(Employee employee);
	public void updateEmployeeDetails(Employee employee);
	public Employee getEmployeeDetailsByEmployeeId(int employeeId);
	public void deleteEmployee(int employeeId);
	public List<Employee> getAllEmployees();
}
