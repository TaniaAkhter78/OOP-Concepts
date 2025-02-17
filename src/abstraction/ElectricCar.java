package abstraction;

public class ElectricCar extends Car {
    @Override
    void startEngine() {
        System.out.println("Starting engine with electric motor");
    }
}
