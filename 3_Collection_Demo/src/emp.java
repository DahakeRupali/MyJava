import java.util.Scanner;

public class emp implements Comparable {
	
	int eid;
	String ename;
	int sal;
	
	public emp() {
		// TODO Auto-generated constructor stub
		ename="Prashant";
	}
	
	public emp(int eid,String ename,int sal) {
		// TODO Auto-generated constructor stub
		
		this.eid=eid;
		this.ename= ename;
		this.sal=sal;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Eid=" + eid+ "ename=" + ename +"salary"+ sal);
	}

	@Override
	 public int compareTo(emp other) {
        return Integer.compare(this.eid, other.eid);
    }

	/*
	 * @Override public int compareTo(Object o) { // TODO Auto-generated method stub
	 * emp e=(emp)o; int id =e.eid; if(eid>sl) return (1); else return(-1); }
	 */

	/*
	 * @Override public int compareTo(Object o) { // TODO Auto-generated method stub
	 * emp e=(emp)o; return ename.compareTo (e.ename); }
	 * 
	 */
	}

