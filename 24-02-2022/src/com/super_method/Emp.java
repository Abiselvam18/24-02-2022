package com.super_method;

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
		super();//always sub class constructor will call super class constructor
		id = 1012;
		name = "Vimal";
		salary = 58048.50;
		System.out.println("Employee class constructor");
	}

	//blocks
	static
	{
		deptName = "Development";
	}
	
	//methods(behavior)
	public void getEmpInfo()
	{
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
		Emp em = new Emp();
		em.getEmpInfo();
				
	}	

}
