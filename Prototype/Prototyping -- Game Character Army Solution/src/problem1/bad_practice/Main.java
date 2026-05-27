package problem1.bad_practice;

public class Main {

    public static void main(String[] args) {

        // Enemy object with same attributes (clone)
        Enemy e1 = new Enemy("Orc", 100, 15); // 1000 ms
        Enemy e2 = new Enemy("Orc", 100, 15); // 1000 ms
        Enemy e3 = new Enemy("Orc", 100, 15); // 1000 ms
        /*
        .
        .
        .
        . Maybe thousands...
        .
        .
        .
        ???
         */


    }

}
