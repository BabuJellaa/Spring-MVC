package com.spring.company.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/getEmployees")
	public ModelAndView fetchEmployeesList( ) {
		ModelAndView modelAndView=new ModelAndView();
		List<Employee> employees=employeeService.retrieveAllEmployees();
		modelAndView.setViewName("list-users");
		modelAndView.addObject("employees", employees);
		return modelAndView;
	}
	
	@RequestMapping("/userForm")
	public ModelAndView showFormForAdd() {
		ModelAndView modelAndView=new ModelAndView();
		Employee employee=new Employee();
		System.out.println("User form controller called..");
		modelAndView.setViewName("user-form");
		modelAndView.addObject("employees", employee);
		return modelAndView;
	}
	
	@PostMapping("/saveEmployee")
	public ModelAndView saveEmployee(@ModelAttribute("employees") Employee employee) {
		System.out.println("Employee details from controller,,"+employee.getEmployeeId()+employee.getEmployeeName()+employee.getEmployeeRole());
		ModelAndView modelAndView=new ModelAndView();
		employeeService.addEmployee(employee);
		modelAndView.setViewName("redirect:/getEmployees");
		return modelAndView;
	}
	
	@PostMapping("/updateEmployee")
	public ModelAndView showFormForEdit(@ModelAttribute("employees") Employee employee) {
		ModelAndView modelAndView=new ModelAndView();
		employeeService.updateEmployeeDetails(employee);
		modelAndView.setViewName("redirect:/getEmployees");
		return modelAndView;
	}
	
	@GetMapping("/updateForm")
	public ModelAndView showFormForUpdate(
			@RequestParam("employeeId") int employeeId) {
		System.out.println("Request param employeeID : "+employeeId);
		ModelAndView modelAndView=new ModelAndView();
		Employee employee=employeeService.fetchEmployeeById(employeeId);
		modelAndView.setViewName("user-edit");
		modelAndView.addObject("employees", employee);
		return modelAndView;
	}
	
	@GetMapping("/delete")
	public String deleteEmployee(
			@RequestParam("employeeId") int employeeId) {
		employeeService.removeEmployee(employeeId);
		return "redirect:/getEmployees";
	}
}
