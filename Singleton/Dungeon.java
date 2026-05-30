public class Dungeon {


    // GameManager gm2 = new GameManager();

    public void clearDungeon() {

        System.out.println("Dungeon cleared!");

        //gm2.addScore(500);
        GameManager.getInstance().addScore(500);
        GameManager.getInstance().addCoins(100);
        GameManager.getInstance().nextLevel();
    }
}