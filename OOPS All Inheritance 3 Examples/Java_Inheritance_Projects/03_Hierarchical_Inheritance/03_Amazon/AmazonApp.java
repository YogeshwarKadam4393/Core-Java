public class AmazonApp {
    public static void main(String[] args) {
        Electronics electronics = new Electronics();
        electronics.productId = 101;
        electronics.productName = "Laptop";
        electronics.price = 55000;
        electronics.displayProduct();
//        electronics.warranty();

        System.out.println("----------------");

        Clothing clothing = new Clothing();
        clothing.productId = 102;
        clothing.productName = "T-Shirt";
        clothing.price = 999;
        clothing.displayProduct();
        clothing.size();

        System.out.println("----------------");

        Grocery grocery = new Grocery();
        grocery.productId = 103;
        grocery.productName = "Rice";
        grocery.price = 1200;
        grocery.displayProduct();
        grocery.expiryDetails();
    }
}
