
public class AbstractionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abs_Fan myFan = new Abs_Fan(); // Creating an object of Fan 
		
        myFan.turnOn();  // Calls implemented abstract method
        myFan.turnOff(); // Calls inherited concrete method

	}

}
