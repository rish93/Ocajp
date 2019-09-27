package com.ocajp.inheritence;

import java.util.List;

import com.ocajp.programs.Employee;
import com.ocajp.programs.Manager;

/**
 * Which base class members aren’t inherited by a derived class?
A derived class doesn’t inherit the following members:
members of the base class.
private
¦
Base class members with default access, if the base class and derived classes exist
¦
in separate packages.
Constructors of the base class. A derived class can call a base class’s construc
¦
tors,
but it doesn’t inherit them (section 6.5 discusses how a derived class can
call a base class’s constructors using the implicit reference super).*/


/*
 * an abstract
class can force all its derived classes to define
abstract
their own implementations for a behavior by defining it as an
method (
abstract*/


class Employee {
	protected String name;
	protected String address;
	protected String phoneNumber;
	protected float experience;
}
class Manager extends Employee {
	protected int teamSize;
	
	public void reportProjectStatus() {}
}
class Programmer extends Employee {
		private String[] programmingLanguages;
	
		public void writeCode() {}
	
		public void accessBaseClassMembers() {
		 name = "Programmer";
	}
		
		
//		CHILD IS A BASE CLASS RELATION
//		MANAGER IS A EMPLOYEE
}


/////////////////////////

class Employee
{
	Employee emp1= new Manager();
   int score=12;
	private String department;
    private Integer address;
    protected int education;
   int scc= emp1.score;//its own
    //So on...
}
class Manager extends Employee {
    private List<Employee> reportees;
    int score=10;
    Manager manager= new Manager();
    Employee emp= new Employee();
    Employee emp1= new Manager();

    int  education=manager.education;
    int s= manager.score;//score of manager
   
  int d=  emp.score;
   int f=   emp1.score;
    int ss=super.score;
    
}


