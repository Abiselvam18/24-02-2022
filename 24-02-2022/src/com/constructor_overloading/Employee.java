package com.constructor_overloading;

//Constructor overloading: Constructor name is same but change in parameters
public class Employee 
{
	
	//variables(state)
	int id;
	String name;
	double salary;
	
	static String deptName;

	//default constructor(without parameters)
	public Employee() 
	{
		id = 1000;
		name = "vijay";
		salary = 80000.68;
	}
	
	
	//parameterized constructor(with parameters)
	public Employee(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	//blocks
	static
	{
		deptName = "Company";
	}
	
	//methods without parameters
	public void getInformation()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(deptName);
	}
	
	//main
	public static void main(String[] args) 
	{ 
		//objects
		Employee employee = new Employee();
		employee.getInformation();
		
		System.out.println("============");
		
		Employee employee1 = new Employee(1001, "Rahul", 63542.54);
		employee1.getInformation();
		
	}	
	

}

