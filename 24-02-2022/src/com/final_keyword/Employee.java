package com.final_keyword;

//sub/derived/child class

//The type Employee cannot subclass/extends the final class Organization
public class Employee extends Org
{
	
	//variables(state)
	int id;
	String name;
	double salary;
	
	static String deptName;

	//constructors
	public Employee() 
	{
		id = 1000;
		name = "Vijay";
		salary = 87454.45;
	}

	//blocks
	static
	{
		deptName = "IT";
	}
	
	//methods(behavior)
	//Cannot override the final method from Organization
	public void getInformation()
	{
		System.out.println("Final Keyword");
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(deptName);
		System.out.println(super.id);
		System.out.println(super.name);
	}
	
	//main
	public static void main(String[] args) 
	{ 
		//object creation statement
		Employee employee = new Employee();
		employee.getInformation();
		
	}	
	

}
