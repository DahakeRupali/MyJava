import java.util.Arrays;

public class ArrayDeclarationExamples
{
    public static void main(String[] args) {
        // 1️⃣ Declaration without initialization (default values)
        int[] arr1 = new int[5]; // Default values: {0, 0, 0, 0, 0}
        
        // 2️⃣ Direct initialization
        int[] arr2 = {10, 20, 30, 40, 50};

        // 3️⃣ Declaration & initialization using 'new'
        int[] arr3 = new int[]{5, 15, 25, 35, 45};

        // 4️⃣ Multi-dimensional array
        int[][] arr4 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // 5️⃣ Array of Strings
        String[] arr5 = new String[]{"Java", "Python", "C++"};
        char [] arr6=new char[] {'A','s'};

        // Printing all arrays
        System.out.println("Array 1 (Default values): " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Array 3: " + Arrays.toString(arr3));

        // Printing multi-dimensional array
        System.out.println("Multi-dimensional Array:");
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(Arrays.toString(arr4[i]));
        }

        // Printing String Array
        
        System.out.println(" Printing....."+ Arrays.toString(arr1));
        System.out.println("String Array: " + Arrays.toString(arr5));
        System.out.println(arr6);
        System.out.println(arr1);
        
       
    }
}
