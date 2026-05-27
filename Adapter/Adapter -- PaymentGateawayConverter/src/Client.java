// Client Sınıf.
public class Client {


    static void main(String[] args) {
        PaymentProcessor processor =
                new PaypalAdapter(new PaypalAPI());



        processor.pay(100);


    }
    }

