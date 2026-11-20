public class Electronics extends Product implements Discount {
    @Override
    public void applyDiscount() {
        double discount = price * 0.10;
        System.out.println("Electronics Discount : " + discount);
        System.out.println("Final Price : " + (price - discount));
    }
}
