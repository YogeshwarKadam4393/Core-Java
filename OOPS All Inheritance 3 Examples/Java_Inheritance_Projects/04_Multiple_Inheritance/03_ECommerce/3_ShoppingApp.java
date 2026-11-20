public class ShoppingApp {
    public static void main(String[] args) {
        ShoppingOrder order = new ShoppingOrder();

        order.processPayment();
        order.sendNotification();
    }
}
