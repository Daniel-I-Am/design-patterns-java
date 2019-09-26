public class PaymentFactory {

    private PaymentContext paymentContext;

    public PaymentFactory(PaymentContext paymentContext) {
        this.paymentContext = paymentContext;
    }

    public PaymentMethod getPaymentMethod() {
        if (paymentContext.isBitCoinAllowed()) {
            return new BitCoin();
        }
        else {
            return new PayPal();
        }
    }

}
