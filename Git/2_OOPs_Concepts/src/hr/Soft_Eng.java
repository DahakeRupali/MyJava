package hr;

public class Soft_Eng extends Employee {
	String tech;
	

	public Soft_Eng() {
		// TODO Auto-generated constructor stub
		super();
		tech="ASP.NET";
	}
	public Soft_Eng(int eid,String en,double sal,String tech)
	{
		
		/*
		 * empid=eid; ename=en; salary=sal;
		 */
		super(eid,en,sal);
		this.tech =tech;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ "Technology=" + tech;
	}

}
