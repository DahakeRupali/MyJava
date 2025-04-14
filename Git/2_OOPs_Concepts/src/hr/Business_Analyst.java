package hr;
public class Business_Analyst extends  Employee{
	String domain;

	

	public Business_Analyst() 
	{
		// TODO Auto-generated constructor stub
		
	 super();
		domain="Banking";
		
	}
	public Business_Analyst(int eid,String en,double sal,String domain)
	{
		
		/*
		 * empid=eid; ename=en; salary=sal;
		 */
		super(eid,en,sal);
		this.domain=domain;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Domain =" + domain;
		
	}

}
