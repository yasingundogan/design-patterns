public class Player {

   //  GameManager gm1 = new GameManager();

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void killMonster() {

        System.out.println(name + " killed a monster!");

        // gm1.addScore(100);
        GameManager.getInstance().addScore(100);
        GameManager.getInstance().addCoins(20);
    }

    public void completeQuest() {

        System.out.println(name + " completed a quest!");

        GameManager.getInstance().addScore(250);
        GameManager.getInstance().addCoins(50);
    }
}