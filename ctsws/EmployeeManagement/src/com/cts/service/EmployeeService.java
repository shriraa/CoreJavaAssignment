package com.cts.service;

import java.util.List;

import com.cts.bean.Employee;

public interface EmployeeService {
	
	//declare all the CRUD operations
	
	
	//create
	
	public boolean   save(Employee emp);
	
	//update
	public boolean   update(Employee emp);
	
	//delete
	
	public boolean   delete(int id);
	
	//get
	public Employee   get(int id);
	
	//get all
	
	public  List<Employee>        get();
	
	
	
	
	public void display(Employee emp);
	
	public void display(List<Employee> empList);
	
	
	
	
	
	
	
	
	
	

}
