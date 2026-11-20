public class PhonePeApp {
    public static void main(String[] args) {
        UPIPayment upi = new UPIPayment();
        upi.validatePayment();
        upi.payUsingUPI();

        System.out.println("----------------");

        CardPayment card = new CardPayment();
        card.validatePayment();
        card.payUsingCard();

        System.out.println("----------------");

        WalletPayment wallet = new WalletPayment();
        wallet.validatePayment();
        wallet.payUsingWallet();
    }
}
