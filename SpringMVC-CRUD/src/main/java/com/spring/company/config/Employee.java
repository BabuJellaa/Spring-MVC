package com.spring.company.config;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employeeSpringmvct")
public class Employee {	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="employeeId")
	private int employeeId;	
	@Column(name="employeeName")
	private String employeeName;
	@Column(name="employeeRole")
	private String employeeRole;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeRole() {
		return employeeRole;
	}
	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}
}
