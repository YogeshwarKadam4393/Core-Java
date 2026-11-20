public class BankingApp {
    public static void main(String[] args) {
        PremiumSavingsAccount account = new PremiumSavingsAccount();

        account.deposit(10000);
        account.calculateInterest();
        account.premiumBenefits();
    }
}
