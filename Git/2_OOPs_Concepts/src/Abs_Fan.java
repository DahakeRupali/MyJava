// Concrete class for a specific device (Fan)
class Abs_Fan extends Abstract_Device {
    // Implementing the abstract method
    @Override
    void turnOn() {
        System.out.println("Fan is turning on...");
    }
}