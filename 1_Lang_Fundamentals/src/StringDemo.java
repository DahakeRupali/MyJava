import java.util.Arrays;

public class StringDemo {
	


	    public static void main(String[] args) {
	        // 1. Creating Strings
	        String str1 = "Hello";  // Using string literal
	        String str2 = new String("World");  // Using new keyword

	        // 2. String Methods
	        System.out.println("Length: " + str1.length());
	        System.out.println("Character at index 1: " + str1.charAt(1));
	        System.out.println("Substring: " + str1.substring(1, 4));
	        System.out.println("Concatenation: " + str1.concat(" " + str2));
	        System.out.println("Contains 'lo': " + str1.contains("lo"));
	        System.out.println("Uppercase: " + str1.toUpperCase());
	        System.out.println("Replaced 'l' with 'p': " + str1.replace('l', 'p'));
	        System.out.println("Trimmed: '" + "  Java  ".trim() + "'");

	        // 3. String Comparison
	        System.out.println("Equals: " + str1.equals("Hello"));
	        System.out.println("CompareTo: " + str1.compareTo("Hello"));

	        // 4. StringBuffer and StringBuilder
	        //Use StringBuffer if multiple threads will modify the same string (e.g., in a multi-threaded program).
	       //Use StringBuilder when working in a single-threaded environment where performance matters.
	        StringBuffer sb = new StringBuffer("Hello");
	        sb.append(" World!");
	        System.out.println("StringBuffer: " + sb);

	        StringBuilder sb2 = new StringBuilder("Java");
	        sb2.append(" Programming");
	        System.out.println("StringBuilder: " + sb2);
	        
	        // Insert at specific position
	        sb.insert(6, "Java ");
	        System.out.println("After insert: " + sb); // Hello Java World

	        // Replace text
	        sb.replace(6, 10, "C++");
	        System.out.println("After replace: " + sb); // Hello C++ World

	        // Delete characters
	        sb.delete(6, 10);
	        System.out.println("After delete: " + sb);  // Hello  World

	        // Reverse the string
	        sb.reverse();
	        System.out.println("After reverse: " + sb); // dlroW  olleH
	        
	        String word1 = " Hi Bob ";
	        String word2 = word1.trim();
	        //word2 is “Hi Bob” – no spaces on either end
	        //word1 is still “ Hi Bob “ – with spaces
	        System.out.println(word2);
	        System.out.println(word1);
	        
	        word1.toUpperCase();
	        System.out.println( word1.toUpperCase());
	        
	        word1=word1.toUpperCase();
	        System.out.println(word1);
	        

 

	        
	    }

	   

	}

