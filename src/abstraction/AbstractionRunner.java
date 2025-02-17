package abstraction;

public class AbstractionRunner {

    public static void main(String[] args) {

        Car bmw = new PetrolCar();
        Car tesla = new ElectricCar();

        bmw.startEngine();
        tesla.startEngine();

    }

}
