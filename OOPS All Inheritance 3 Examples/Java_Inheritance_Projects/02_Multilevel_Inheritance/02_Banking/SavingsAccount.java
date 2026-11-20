public class SavingsAccount extends Account {
    public void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Interest : " + interest);
    }
}
