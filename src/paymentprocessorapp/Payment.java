package paymentprocessorapp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public interface Payment {

    void processPayment(double amount);

    void refundPayment(double amount);

    String getTransactionStatus();

    void getPaymentHistory();

}

abstract class OnlinePayment implements Payment {

    protected List<String> transactionsList = new ArrayList<>();

    void logPayment(String transactionId, double amount) {
        this.transactionsList.add("TransactionId : " + transactionId + "| Amount :" + amount);
        System.out.println("Logging: Payment of amount " + amount + " | Transaction Id:" + transactionId);

    }

    void validateTransaction() {
        System.out.println("Transaction validated successfully");
    }

    public void getPaymentHistory() {
        System.out.println("Transaction History:");
        for (String transaction : this.transactionsList) {
            System.out.println(transaction);
        }
    }
}


class CreditCard extends OnlinePayment {

    String transactionId = null;

    @Override
    public void processPayment(double amount) {
        this.validateTransaction();
        transactionId = UUID.randomUUID().toString();
        logPayment(transactionId, amount);
        System.out.println("Processing Credit Card Payment for amount:" + amount);

    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding " + amount + " for Credit Card");
    }

    @Override
    public String getTransactionStatus() {
        return "Transaction " + transactionId + " is successful";
    }

}


class Paypal extends OnlinePayment {

    String transactionId = null;

    @Override
    public void processPayment(double amount) {
        this.validateTransaction();
        transactionId = UUID.randomUUID().toString();
        logPayment(transactionId, amount);
        System.out.println("Processing  Payment of amount:" + amount + "through Paypal");

    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding " + amount + " to Paypal");

    }

    @Override
    public String getTransactionStatus() {
        return "Transaction " + transactionId + " is pending";
    }

}

class UPI extends OnlinePayment {

    String transactionId = null;

    @Override
    public void processPayment(double amount) {
        this.validateTransaction();
        transactionId = UUID.randomUUID().toString();
        logPayment(transactionId, amount);
        System.out.println("Processing  for amount:" + amount + "through UPI");

    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding " + amount + " to UPI ID");

    }

    @Override
    public String getTransactionStatus() {
        return "Transaction " + transactionId + " is completed";
    }


}
