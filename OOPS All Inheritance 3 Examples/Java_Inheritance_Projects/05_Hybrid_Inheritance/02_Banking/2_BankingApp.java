public class BankingApp {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        savings.transferMoney(5000);
        savings.checkBalance();

        System.out.println("----------------");

        CurrentAccount current = new CurrentAccount();
        current.transferMoney(10000);
        current.checkBalance();
    }
}
