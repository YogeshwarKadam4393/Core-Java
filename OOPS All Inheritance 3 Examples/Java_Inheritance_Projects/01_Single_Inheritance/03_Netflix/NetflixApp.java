public class NetflixApp {
    public static void main(String[] args) {
        PremiumSubscriber subscriber = new PremiumSubscriber();

        subscriber.login();
        subscriber.activateSubscription();
        subscriber.watchPremiumContent();
    }
}
