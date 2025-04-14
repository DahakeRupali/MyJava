package hr;
import java.util.ArrayList;
import java.util.Scanner;

public class PayRoll {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Employee e1=new Employee(102,"Rupali",78999);
			Employee e2=new Employee(102,"Rupali",78999);
			System.out.println(e1==e2);
			System.out.println(e1.equals(e2));
				//Manager manager = new Manager(101, "1 ABC St", 80, 5);
		
			// Using employee Array
		/*
		 * Employee []emparr= new Employee[10]; emparr[0] = new
		 * Employee(101,"Ram",6000.0); emparr[1] = new Employee(102,"Jiya",6000.0);
		 * emparr[2] = new Business_Analyst(103,"SIYa",5600,"Production"); emparr[3]=
		 * new Soft_Eng(104,"RIMA",89000,"JAVA"); emparr[4]= new
		 * Manager(105,"TOM",9000,50);
		 */
//		
//		 ArrayList<Employee> emplist=new ArrayList<Employee>();
//		 emplist.add(new Employee(101,"Ram",6000.0));
//		 emplist.add(new Manager(103,"SIMA",8900.0,80));
//		 emplist.add(new Soft_Eng(102,"Mohan",98.889,".NET"));
//		 emplist.add(new Business_Analyst(105,"Tina",56.77,"Banking"));
//		 
		 for ( Employee e: emplist)
			 // Dynamic Polymorphism using overriding
			 (e.cal_sal(0);
		 	 System.out.println(e);
		 
		 }
//		 
		 
/*		 //e[1] = new Employee
				 (102,"Riya",6000,b.domain); //emparr[0]=new Employee(1001,"Prashant",70000,);
		
		
		 * //Employee e1=new Employee(); Business_Analyst b=new Business_Analyst();
		 * 
		 * //Employee e2=new Employee(1001,"Prashant",70000);
		 * 
		
		
		/*
		 * System.out.println("employee id " + e1.empid);
		 * System.out.println("employee name "+e1.ename);
		 * System.out.println("employee saalry "+ e1.salary);
		 
		
		//System.out.println("Emplloyee 1:" + e1 + "Object Reference" + e1.hashCode());
		//System.out.println("Emplloyee 2:" + e2 + "Object Reference" + e2.hashCode());
		
		//Department d1=new Department() ;
		
		
		 * e1.setSalary(75000); System.out.println(e1);
		 */
	}
}


