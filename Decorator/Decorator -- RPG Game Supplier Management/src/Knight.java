/**
 * Concrete Component
 *
 * The base character.
 *
 * This class knows nothing about swords,
 * armor or enchantments.
 */
public class Knight extends Character {

    @Override
    public String getDescription() {

        return "Knight";
    }

    @Override
    public int getAttack() {

        return 100;
    }

    @Override
    public int getDefense() {

        return 50;
    }

    @Override
    public int getMagicDamage() {

        return 0;
    }
}