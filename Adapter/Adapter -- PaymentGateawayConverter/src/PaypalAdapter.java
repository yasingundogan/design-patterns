// Adapter Sınıf : 3. parti uygulamayla Target sınıfı birbibine bağlar.
public class PaypalAdapter  implements PaymentProcessor{

    //*********** Bağlanacak Nesne yi Adapter üzerindeki constructor üzerinden oluştur  (yani burada da private paypal api ile yeni nesne oluşturabiriliriz.---------*******
    private PaypalAPI PayPalAPI;



    public PaypalAdapter(PaypalAPI paypalAPI)
    {
        this.PayPalAPI = paypalAPI;
    }


    //*********** Bağlanacak diğer nesnesi de adapter üzerinden inheritance ederek çek (yani burada interface i implement edip metodu override ediyoruz) ---------*******
    @Override
    public void pay(int amount) {
        PayPalAPI.makePayment(amount);
    }
}
