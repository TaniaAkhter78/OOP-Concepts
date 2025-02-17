package polymorphism;

public class CreditCardPayment extends Payment {

    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment method : " + amount);
    }
}
