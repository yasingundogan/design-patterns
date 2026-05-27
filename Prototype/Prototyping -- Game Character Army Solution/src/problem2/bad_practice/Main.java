package problem2.bad_practice;

public class Main {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance(); // notice that we dont use new keyword, we implement it by using .getinstance() method

        Singleton s2 = Singleton.getInstance();


    }

}
