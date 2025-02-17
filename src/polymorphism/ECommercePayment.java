package polymorphism;

public class ECommercePayment {

    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();
        Payment p3 = new PayPalPayment();

        processPayment(p1, 2000);
        processPayment(p2, 30000.75);
        processPayment(p3, 1000.50);

    }

    public static void processPayment(Payment payment, double amount) {
        payment.processPayment(amount);
    }

}
