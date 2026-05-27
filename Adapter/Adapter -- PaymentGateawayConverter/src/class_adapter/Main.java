package class_adapter;

public class Main {
    static void main(String[] args) {

        PaymentProcessor2 paymentProcessor = new ClassAdapter();
        paymentProcessor.processPayment(500);

    }
}
