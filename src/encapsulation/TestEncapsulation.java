package encapsulation;

public class TestEncapsulation {

    public static void main(String[] args) {
        BankAccount karim = new BankAccount("ABC001", "Mohammad Karim");
        karim.deposit(5000);
        karim.withdraw(2000);
        karim.deposit(-500);
        karim.withdraw(3500);
        karim.deposit(0);
        System.out.println("Name: " + karim.getAccountHolderName() + "\nACC Number: " + karim.getAccountNumber());

        System.out.println();

        BankAccount tania = new BankAccount("ABC002", "Tania Akter");
        tania.deposit(10000);
        tania.withdraw(5000);
        tania.deposit(-500);
        tania.withdraw(10500);
        tania.deposit(0);

        System.out.println("Name: " + tania.getAccountHolderName() + "\nACC Number: " + tania.getAccountNumber());

    }

}
