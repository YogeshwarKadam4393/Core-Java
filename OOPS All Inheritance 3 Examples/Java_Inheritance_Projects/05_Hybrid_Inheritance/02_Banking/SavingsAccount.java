public class SavingsAccount extends Account implements Transaction {
    @Override
    public void transferMoney(double amount) {
        balance = balance - amount;
        System.out.println("Savings Account Transfer : " + amount);
    }
}
