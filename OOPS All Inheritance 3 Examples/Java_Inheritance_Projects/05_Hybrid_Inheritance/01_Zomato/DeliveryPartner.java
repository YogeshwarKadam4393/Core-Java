public class DeliveryPartner extends User implements LocationTracking {
    @Override
    public void trackLocation() {
        System.out.println("Tracking Delivery Partner Location");
    }

    public void deliverOrder() {
        System.out.println("Order Delivered Successfully");
    }
}
