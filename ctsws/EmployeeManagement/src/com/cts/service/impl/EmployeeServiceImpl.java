package com.cts.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.cts.bean.Employee;
import com.cts.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	
	private List<Employee> empList;
	
	public EmployeeServiceImpl()
	{
		empList = new ArrayList<Employee>();
	}

	@Override
	public boolean save(Employee emp) {
		
		if(get(emp.getId())!=null)
		{
			return false;
		}
		
		empList.add(emp);
		
		
		
		return true;
	}

	@Override
	public boolean update(Employee emp) {
		
		if(get(emp.getId())==null)
		{
			return false;
		}
		
		empList.add(emp);
		
		
		
		return true;
	}

	@Override
	public boolean delete(int id) {
		Employee emp = get(id);
		if(emp==null)
		{
			return false;
		}
		
		empList.remove(emp);
		
		
		
		return true;
	}

	@Override
	public Employee get(int id) {
		
		for(Employee emp : empList)
		{
			if(emp.getId() == id)
				return emp;
			
		}
		return null;
		
	}

	@Override
	public List<Employee> get() {
		// TODO Auto-generated method stub
		return empList;
	}
	
	public void display(Employee emp)
	{
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
	}

	@Override
	public void display(List<Employee> empList) {
		for(Employee emp: empList)
		{
			display(emp);
		}
		
	}
	

}
