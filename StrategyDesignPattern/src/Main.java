public class Main {

    public static void main(String[] args) {

        PaymentContext paymentContext = new PaymentContext();
        PaymentFactory paymentFactory = new PaymentFactory(paymentContext);

        PaymentMethod paymentMethod1 = paymentFactory.getPaymentMethod();

        paymentContext.setBitCoinAllowed(false);

        PaymentMethod paymentMethod2 = paymentFactory.getPaymentMethod();

        float price = 10f;

        paymentMethod1.pay(price);
        paymentMethod2.pay(price);

    }

}
