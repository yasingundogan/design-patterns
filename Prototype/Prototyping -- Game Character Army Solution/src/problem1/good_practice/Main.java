package problem1.good_practice;

public class Main {
    public static void main(String[] args) {

        Enemy baseOrc = new Enemy("Orc", 100, 15); // Prototype instance ... DNA

        Enemy e1 = baseOrc.clone(); // Clones of prototype instance .....>  .objclone() mitosis separation        Enemy e2 = baseOrc.clone();
        Enemy e3 = baseOrc.clone();



    }


}
