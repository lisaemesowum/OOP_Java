package InterfaceOOP.serviceInterface;

public class PaystackImpl implements Payment {

    @Override
    public void pay(long amount) {
        System.out.println("The amount you paid via Paystack is ₦" + amount);
    }

    @Override
    public void refund(long amount) {
        System.out.println("The refund via Paystack for amount ₦" + amount + " is being processed.");
    }
}
