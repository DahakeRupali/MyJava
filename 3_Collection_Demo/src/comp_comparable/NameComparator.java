package comp_comparable;

import java.util.Comparator;

//Separate comparator class to sort by product name
public class NameComparator implements Comparator<Product> {
 @Override
 public int compare(Product p1, Product p2) {
     return p1.name.compareTo(p2.name);
 }
}

