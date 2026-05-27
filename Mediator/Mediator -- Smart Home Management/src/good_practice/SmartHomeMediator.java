package good_practice;

public interface SmartHomeMediator {

    // notify haberdar etmek

    /*
    Bu sınıf ana concrete SmartHub client classına
    haberdar etmek ve sadece çağrıda bulunmak amacıyla
    yazar. Ne yapacağını anlatmaz.
     */

    void notify (String event);



}
