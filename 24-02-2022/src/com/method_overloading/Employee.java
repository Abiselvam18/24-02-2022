package com.method_overloading;

//Method overloading: Method name is same but change in parameters
public class Employee 
{
	
	//variables(state)
	int id;
	String name;
	double salary;
	
	static String deptName;

	//default constructor
	public Employee() 
	{
		id = 1000;
		name = "varun";
		salary = 8000.68;
	}

	//blocks
	static
	{
		deptName = "Office";
	}
	
	//methods without parameters
	public void getInformation()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(deptName);
	}
	
	//method with parameters
	public void getInformation(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
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
		
		System.out.println("=========");
		
		employee.getInformation(2000, "Manoj", 48765.34);
		
	}	
	

}
