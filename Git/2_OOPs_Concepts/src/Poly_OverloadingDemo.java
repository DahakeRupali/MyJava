
public class Poly_OverloadingDemo {

	public static void main(String[] args) {
		
		PolyMathOperations math = new PolyMathOperations();

        System.out.println("Sum of 2 numbers: " + math.add(5, 10));
        System.out.println("Sum of 3 numbers: " + math.add(5, 10, 15));
        System.out.println("Sum of Float No =" + math.add(3.8,4.9,5.8,6.2));
		// TODO Auto-generated method stub

	}

}

