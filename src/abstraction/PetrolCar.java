package abstraction;

public class PetrolCar extends Car {
    @Override
    void startEngine() {
        System.out.println("Starting engine with push button");
    }
}
