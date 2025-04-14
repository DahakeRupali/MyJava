
public class demoOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Arithmetic Operators
		int a = 20;
		int b = 15;
		System.out.println("a + b = " + (a + b)); 
		System.out.println("a - b = " + (a - b)); 
		System.out.println("a * b = " + (a * b)); 
		System.out.println("a / b = " + (a / b)); 
		System.out.println("a % b = " + (a % b));
		
		//Relational Operators
				System.out.println("a > b: " + (a > b)); 
				System.out.println("a < b: " + (a < b)); 
				System.out.println("a == b: " + (a == b)); 
				System.out.println("a != b: " + (a != b)); 
		
		// Unary Operators
		int c =43;
		
		System.out.println(" c++ =" + (c++));
		System.out.println(" c++ =" + (c++));
		System.out.println("+ c =" + (++c));
		System.out.println("-- c =" + (--c));
		System.out.println(" c-- =" + (c--));
		
		// ternary Operators
	 int x = 20, y = 10; 
		int result = (x > y ? x : y);
		System.out.println("Max of  numbers = " + result);
		
		
		//Logical Operators
		boolean xp = true;
		boolean yp = false;
		System.out.println("x && y: " + (xp && yp)); // Output: false
		System.out.println("x || y: " + (xp || yp)); // Output: true
		System.out.println("!x: " + (!xp)); // Output: false
	}

	
}
