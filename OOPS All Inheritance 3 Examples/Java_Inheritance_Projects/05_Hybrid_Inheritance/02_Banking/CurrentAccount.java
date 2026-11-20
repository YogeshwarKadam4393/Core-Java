public class CurrentAccount extends Account implements Transaction {
    @Override
    public void transferMoney(double amount) {
        balance = balance - amount;
        System.out.println("Current Account Transfer : " + amount);
    }
}
