package com.cts.oop;

public class Employee extends Person {
	
	
	private int id;
	
	private int salary;
	
	private char gender;
	
	private  Employee   manager;
	
	public Employee()
	{
		System.out.println("Calling Sub class constructor");
	}
	
	/*public Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}*/
	
	/*public Employee(int id, String name, int salary)
	{
		this(id,name);
		this.salary = salary;
		
	}*/
	
	
	
	
	
	//getter/setter methods
	//for each property
	
	public char getGender() {
		
		return gender;
	}

	


	public void setGender(char gender) {
		if(gender != 'M'  || gender !='F')
		{
			System.out.println("Invalid gender");
			return;
		}
		this.gender = gender;
	}

	// get employee id
	public int getId()
	{
		return id;
	}
	
	//set employee id
	public void setId(int id)
	{
		this.id = id;
	}

	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		//
		if(salary<10_000 || salary>1_00_000)
		{
			System.out.println("Invalid salary. setting the "
					+ "default salary i.e., 10,000");
			salary=10_000;
		}
		this.salary = salary;
	}
	

}
