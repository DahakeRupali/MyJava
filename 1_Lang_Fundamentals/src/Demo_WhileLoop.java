import java.util.Scanner;

public class Demo_WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the number: ");
        int n=sc.nextInt();      //Declare and initialize the number
     
        int i=11;
        System.out.println("The multiplication table of "+n+" is: ");
        //Infinite Loop Example      
        do
        {
           System.out.println(n+" * "+i+" = "+ (n*i));
            i++;
        }
        while(i<=10);
     }
	}



