import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class DemoSwitchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Your Grade");
		Scanner sc=new Scanner(System.in);
		String grade= sc.next();
		
		switch (grade)
		{
		case "A":
		{
			
			System.out.println("Excellent");;
			break;
		}
		case "B":
		{
			System.out.println("Very Good");;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + grade);
		}

	}

}
