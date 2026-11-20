public class ShoppingOrder implements Payment, Notification {
    @Override
    public void processPayment() {
        System.out.println("Order Payment Successful");
    }

    @Override
    public void sendNotification() {
        System.out.println("Order Confirmation Sent");
    }
}
