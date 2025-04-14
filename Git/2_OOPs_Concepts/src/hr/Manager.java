package hr;

public class Manager extends Employee {
	
	int team_size;

	public Manager() {
		// TODO Auto-generated constructor stub
		super();
		team_size=50;
			
	}
	
	public Manager(int eid,String en,double sal,int ts)
	{
		
		/*
		 * empid=eid; ename=en; salary=sal;
		 */
		super(eid,en,sal);
		team_size=ts;
		
	}
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ "Team Size=" + team_size;
	}

}
