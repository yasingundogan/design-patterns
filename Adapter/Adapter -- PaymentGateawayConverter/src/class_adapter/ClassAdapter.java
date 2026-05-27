package class_adapter;

public class ClassAdapter extends LegacyBankGateaway implements PaymentProcessor2 {


    @Override
    public void processPayment(double amount) {
        System.out.println("Converting payment request...");
        transerMoney(amount);
    }



}
