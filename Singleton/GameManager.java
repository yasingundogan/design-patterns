public class GameManager {

    private static GameManager instance;
    /*
    GameManager gm = new GameManager();
     */


    private int score;
    private int coins;
    private int level;


    // 1 -constructor u private yap.
    private GameManager() {
        score = 0;
        coins = 0;
        level = 1;
    }

    // 2 - peki dışarıdan nasıl obje oluşturacağız : metot ile.
    // NOT : statik metotlar NESNE olmadan çağrılabilir !
    // NOT 2 : Hep aynı nesneyi dönüyor.
    public static GameManager getInstance() {

        if (instance == null) {
            instance = new GameManager();
        }

        return instance;
    }



    public void addScore(int points) {
        score += points;
    }

    public void addCoins(int amount) {
        coins += amount;
    }

    public void nextLevel() {
        level++;
    }

    public void printGameState() {

        System.out.println("\n===== GAME STATE =====");
        System.out.println("Score : " + score);
        System.out.println("Coins : " + coins);
        System.out.println("Level : " + level);
        System.out.println("======================");
    }
}