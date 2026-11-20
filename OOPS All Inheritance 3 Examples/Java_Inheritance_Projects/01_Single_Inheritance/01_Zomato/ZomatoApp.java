public class ZomatoApp {
    public static void main(String[] args) {
        Customer customer = new Customer();

        System.out.println("Name  : " + customer.name);
        System.out.println("Email : " + customer.email);
        customer.login();
        customer.placeOrder();
    }
}
