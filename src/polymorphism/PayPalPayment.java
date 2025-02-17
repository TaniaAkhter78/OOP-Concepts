package polymorphism;

public class PayPalPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing paypal payment method : " + amount);
    }
}
