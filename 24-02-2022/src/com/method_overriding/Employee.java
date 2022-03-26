package com.method_overriding;

/**
 * 
 * Polymorphism: One entity in many forms
 * ============
 *
 */

//Sub/Derived/Child class
public class Employee extends Organization
{
	
	//variables(state)
	double salary;
	String location;
	
	static String deptName;

	//constructors
	public Employee() 
	{
		id = 1234;
		name = "Anu";
		salary = 87695.35;
		location="Chennai";
	}

	//blocks
	static
	{
		deptName = "TCS";
	}
	
	//methods(behavior)
	public void getInformation()//overrides com.polymorphism.Organization.getInformation()
	{
		System.out.println("Method Overriding");
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(location);
		System.out.println(deptName);
	}
	
	//main
	public static void main(String[] args) 
	{ 
		//objects
		Employee employee = new Employee();
		employee.getInformation();
		
		System.out.println("==========");
		
		Organization organization = new Organization();
		organization.getInformation();
		
	}	

}
