
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;






public class EMPSORT {

	public static void main(String[] args) {
		
			  // TODO Auto-generated method stub
		List<emp> elist=new ArrayList<emp>();
		 elist.add(new emp (101,"RAMA",10000));
		 elist.add(new emp (103,"TOM",45000));
		 elist.add(new emp (104,"SIMA",34000));
		 elist.add(new emp (102,"JAYA",6700));
		 

		//
		 Collections.sort(elist);
			
		
	        

		
		//
		//
		//System.out.println(elist);
		
		System.out.println("Sorted Employee List:");
        for (emp e : elist) 
            System.out.println(e);
		
	
		 
		 


   
  
   
  
	}

}
