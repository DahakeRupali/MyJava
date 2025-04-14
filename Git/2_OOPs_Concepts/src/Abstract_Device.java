// Abstract class representing a general Device
abstract class Abstract_Device {
    // Abstract method (to be implemented by subclasses)
    abstract void turnOn();

    // --Ready-to-use function : Concrete method (already implemented=)
    void turnOff() {
        System.out.println("Device is turning off...");
    }
}
