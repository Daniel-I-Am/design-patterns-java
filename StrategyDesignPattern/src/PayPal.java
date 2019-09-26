public class PayPal implements PaymentMethod {

    @Override
    public void pay(float price) {
        System.out.println("Payed " + price + " with PayPal");
    }

}
