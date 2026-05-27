package problem1.good_practice;

public class Enemy implements Prototype {
     String name;
     int health;
     int damage;

    public Enemy(String type, int health, int damage) {

        try { Thread.sleep(1000); } catch(Exception e) {}

        this.name = type;
        this.health = health;
        this.damage = damage;
    }




    @Override
    public Enemy clone() {
        return new Enemy(this.name, this.health, this.damage);
    }
}
