public class Account {
    double balance = 50000;

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited : " + amount);
    }
}
