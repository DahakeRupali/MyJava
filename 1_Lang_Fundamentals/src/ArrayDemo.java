
import java.util.Arrays;

public class ArrayDemo {
    public static void main(String args[]){        
           
           int[] numbers = {10, 20, 30, 40, 50,60};
           int[] a= {1,2,3,4,5,6,7,};
           
        // Access elements using index
           System.out.println(numbers[0]); // Output: 10
           System.out.println(numbers[3]); // Output: 40
           
         // numbers[5]=110;
           
           System.out.print("Array elements: ");
           
           
			
//			  //Access Array Method 1:Traditional Loop
//			  
//			  for (int i=0; i<a.length;i++) 
//				  System.out.println(" Dispaly " +a[i]);
//			 
//			

        //Access Array Method 2 : Enhanced For Loop (For-Each)
          for (int i : numbers) {  // Enhanced for-loop
               System.out.print(i+" "+" ");
               
           }
    }
}