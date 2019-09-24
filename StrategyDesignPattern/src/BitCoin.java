public class BitCoin implements PaymentMethod {

    @Override
    public void pay(float price) {
        System.out.println("Payed " + price + " with BitCoin");
    }

}
