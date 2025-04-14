import java.util.Scanner;

public class DemoIfElse_ODDEVEN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter No");
		Scanner sc=new Scanner(System.in);
		int n1= sc.nextInt();
		
		System.out.println("Given No is=");
		if(n1%2==0)
		{
			
			System.out.println("No is EVEN");
		}
		else
			System.out.println("No is ODD");
			
	}

}
