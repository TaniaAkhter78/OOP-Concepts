package polymorphism;

public class UPIPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing UPI payment method : " + amount);
    }
}
