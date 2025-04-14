import java.util.*;

//Generic Class
class Box<T> {  
    T value;

    Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    // Generic Method
    public <U> void showType(U data) {
        System.out.println("Generic method data: " + data + " (Type: " + data.getClass().getSimpleName() + ")");
    }
}

class Calculator {
    // Bounded Generic Method (Only works with Number types)
    public static <T extends Number> double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    // Unbounded Wildcard
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
    
    //
    public static void printUpperBoundedList(List<? super Integer> list) {
    for (Object obj: list) {
        System.out.print(obj);
    }
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        // Generic Class with String
        Box<String> strBox = new Box<>("Hello Rupali!");
        System.out.println("Box value: " + strBox.getValue());
        strBox.showType(123);  // Generic method with Integer

        // Generic Class with Integer
        Box<Integer> intBox = new Box<>(42);
        System.out.println("Box value: " + intBox.getValue());
        intBox.showType(3.14); // Generic method with Double

        // Bounded Generic Method
        double sum = Calculator.add(10, 20); // Integers
        System.out.println("Sum using bounded generic method: " + sum);

        // Unbounded Wildcard
        List<String> names = Arrays.asList("Ayesha", "Ravi", "Meera");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        
        System.out.print("Names List: ");
        Calculator.printList(names);
        
        System.out.print("Numbers List: ");
        Calculator.printList(numbers);
        
        Calculator.printUpperBoundedList(numbers);
    }
}

