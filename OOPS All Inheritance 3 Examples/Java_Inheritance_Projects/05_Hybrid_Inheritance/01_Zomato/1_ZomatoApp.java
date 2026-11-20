public class ZomatoApp {
    public static void main(String[] args) {
        DeliveryPartner partner = new DeliveryPartner();

        partner.login();
        partner.trackLocation();
        partner.deliverOrder();
    }
}
