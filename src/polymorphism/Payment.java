package polymorphism;

public abstract class Payment {

//    3. Polymorphism Assignment (E-Commerce Payment System)
//    Scenario:
//    An E-commerce website has different payment methods:
//    Credit Card
//    PayPal
//    UPI
//    Each payment method processes payments differently.
//    Task:
//    Create a Payment class with processPayment(double amount).
//    Extend it into CreditCardPayment, PayPalPayment, and UPIPayment.
//            Override processPayment() in each subclass.
//    Use a single Payment reference to process payments dynamically.

    abstract void processPayment(double amount);

}
