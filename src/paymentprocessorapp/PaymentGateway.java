package paymentprocessorapp;


import java.util.Scanner;

public class PaymentGateway {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Payment method \n1. Credit Card \n2. PayPal \n3. UPI");
        int choice = scanner.nextInt();

        System.out.println("Enter the payment amount:");
        double amount = scanner.nextDouble();

        Payment payment = null;

        switch (choice) { // 1
            case 1:
                payment = new CreditCard();
                break;

            case 2:
                payment = new Paypal();
                break;

            case 3:
                payment = new UPI();

            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }
        payment.processPayment(amount);

        System.out.println(payment.getTransactionStatus());

        System.out.println("\nDo you want a refund (yes/no)");
        String refundChoice = scanner.next();
        if (refundChoice.equalsIgnoreCase("yes")) {
            payment.refundPayment(amount);
        }

        payment.getPaymentHistory();
        scanner.close();
    }
}
