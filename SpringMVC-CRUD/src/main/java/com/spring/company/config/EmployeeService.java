package com.spring.company.config;

import java.util.List;

public interface EmployeeService{
	public void addEmployee(Employee employee);
	public void updateEmployeeDetails(Employee employee);
	public void removeEmployee(int employeeId);
	public Employee fetchEmployeeById(int employeeId);
	public List<Employee> retrieveAllEmployees();
}