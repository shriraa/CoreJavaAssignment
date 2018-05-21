package com.cts.service.test;

import java.util.List;

import com.cts.bean.Employee;
import com.cts.service.EmployeeService;
import com.cts.service.impl.EmployeeServiceImpl;

public class EmployeeServiceTest {

	public static void main(String[] args) {
		EmployeeService empService = new EmployeeServiceImpl();

		Employee emp;

		emp = new Employee(101, "Saravanan", 2000);

		empService.save(emp);

		emp = new Employee(102, "Sri ram", 4000);

		empService.save(emp);

		emp = new Employee(103, "Revathi", 6000);

		empService.save(emp);
		
		//empService.display(emp);
		
	    List<Employee> empList	=  empService.get();
	    
	    empService.display(empList);

	}

}
