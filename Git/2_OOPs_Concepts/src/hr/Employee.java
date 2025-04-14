package hr;
import java.util.Scanner;

public class Employee
{
	//Data Members
	int empid;
    String ename;
    double salary;
    
 // Construtor
	
	  public Employee() {
	  
	  System.out.println("employee object get created ");
	  empid=1000;
	  ename="Rupali"; 
	  salary=55000;
	  
	  
	  
	  }
	 
   // Business_Analyst b= new Business_Analyst();
	
	//Parametraze constructor
	public Employee(int eid,String en,double sal)
	{
		
		empid=eid;
		ename=en;
		salary=sal;
		//b.domain=role;
	}
	
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
//To Display Emp Details
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Emp Id:"+ empid + "Emp Name:" + ename + "Salary:" + salary);
	}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return (empid==((Employee)obj).empid);
}
//Static Polymorphism using Method overloading
public void cal_sal(double sl) {
	salary=sl+sl*0.1;
}

public void cal_sal(double sl,int inc) {
	salary=sl+inc;
}

	//
	
}
