public class Clothing extends Product implements Discount {
    @Override
    public void applyDiscount() {
        double discount = price * 0.20;
        System.out.println("Clothing Discount : " + discount);
        System.out.println("Final Price : " + (price - discount));
    }
}
