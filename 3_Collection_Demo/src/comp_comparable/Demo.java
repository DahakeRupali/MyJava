package comp_comparable;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(201, "Zaptop", 75000));
        productList.add(new Product(202, "Phone", 50000));
        productList.add(new Product(203, "Tablet", 30000));

        // Sort Product by ID using Comparable
        System.out.println("Sorted by ID (using Comparable):");
        Collections.sort(productList);
        for (Product p : productList) {
            System.out.println(p);
        }

        
     // Sort Product by name using Comparable
        System.out.println("\nSorted by Name (using Comparator):");
        Collections.sort(productList, new NameComparator());
        for (Product p : productList) {
            System.out.println(p);
        }
        
        // 
     // Sort Product by name using Comparable
        System.out.println("\nSorted by Price (using Comparator):");
        Collections.sort(productList, new PriceComparator());
        for (Product p : productList) {
            System.out.println(p);
        }
    }
}
