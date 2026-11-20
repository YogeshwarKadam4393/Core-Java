public class EcommerceApp {
    public static void main(String[] args) {
        Electronics electronics = new Electronics();
        electronics.productName = "Laptop";
        electronics.price = 50000;
        electronics.displayProduct();
        electronics.applyDiscount();

        System.out.println("----------------");

        Clothing clothing = new Clothing();
        clothing.productName = "T-Shirt";
        clothing.price = 1000;
        clothing.displayProduct();
        clothing.applyDiscount();
    }
}
