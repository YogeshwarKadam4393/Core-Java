public class GooglePay implements Payment, Reward {
    @Override
    public void makePayment() {
        System.out.println("Payment Successful");
    }

    @Override
    public void getReward() {
        System.out.println("Cashback Received");
    }
}
