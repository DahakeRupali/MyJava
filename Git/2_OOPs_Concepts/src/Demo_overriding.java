
public class Demo_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal_overriding myAnimal;  // Reference of Parent class

        myAnimal = new Dog_overriding();  // Dog object
        myAnimal.makesound();  // Calls Dog's overridden method

        myAnimal = new Cat_overriding();  // Cat object
        myAnimal.makesound();  // Calls Cat's overridden method
	}

}
