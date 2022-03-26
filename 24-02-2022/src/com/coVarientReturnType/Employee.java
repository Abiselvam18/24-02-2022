package com.coVarientReturnType;

//Sub/Derived/Child class
public class Employee extends Organization
{
	
	//variables(state)
	double salary;
	
	static String deptName;

	//constructors
	public Employee() 
	{
		id =100;
		name = "Jaishu";
		salary = 200000.50;
	}

	//blocks
	static
	{
		deptName = "Institution";
	}
	
	//methods(behavior)
	//public int getInformation()//method return type is void
	public Employee getInformation()
	{
		
		//The return type is incompatible with Organization.getInformation()
		System.out.println("CoVarientReturnType");
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(deptName);
		
		return null;
	}
	
	//main
	public static void main(String[] args) 
	{ 
		//objects
		Employee employee = new Employee();
		employee.getInformation();
		
		System.out.println("=========");
		
		Organization organization = new Organization();
		organization.getInformation();
	}		
	
}
