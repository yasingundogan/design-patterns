package problem1.bad_practice;

class Enemy {

    String type;
    int health;
    int damage;


    public Enemy(String type, int health, int damage) {

        // THERE IS A OBJECT CREATION COST!
        // In every new object creation from Enemy, we runs '1000' delay.
        try { Thread.sleep(1000);
        }catch(Exception e) {
        }

        this.type = type;
        this.health = health;
        this.damage = damage;
    }


}