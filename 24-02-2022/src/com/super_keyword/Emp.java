package com.super_keyword;

//sub/derived/child class
public class Emp extends Org
{
	
	//variables(state)
	int id;
	String name;
	double salary;
	
	static String deptName;

	//constructors
	public Emp() 
	{
		id = 2000;
		name = "Sanjay";
		salary = 600800.45;
	}

	//blocks
	static
	{
		deptName = "Company";
	}
	
	//methods(behavior)
	public void getEmpInfo()
	{
		System.out.println("Super Keyword");
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(deptName);
		System.out.println("*****");
		System.out.println(super.id);
		System.out.println(super.name);
		
		
	}
	
	//main
	public static void main(String[] args) 
	{ 
		//object creation statement
		Emp e = new Emp();
		e.getEmpInfo();
		
	}	

}
