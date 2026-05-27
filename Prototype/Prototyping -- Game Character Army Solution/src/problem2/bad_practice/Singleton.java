package problem2.bad_practice;

public class Singleton {

    private static Singleton instance; // One static Instance

    private Singleton(){}  // dışarıdan new yasak ... Private Constructor

    public static Singleton getInstance(){    // static  getInstance method
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }




}
