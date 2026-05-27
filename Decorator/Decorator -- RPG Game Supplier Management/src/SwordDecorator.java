/**
 * Concrete Decorator
 *
 * Adds an Iron Sword.
 *
 * Bonus:
 * +30 Attack
 */
public class SwordDecorator
        extends CharacterDecorator {

    public SwordDecorator(
            Character character) {

        super(character);
    }

    @Override
    public String getDescription() {

        return character.getDescription()
                + ", Iron Sword";
    }

    @Override
    public int getAttack() {

        /*
         * Ask the wrapped object for its attack value
         * and add this decorator's bonus.
         */
        return character.getAttack()
                + 30;
    }

    @Override
    public int getDefense() {

        return character.getDefense();
    }

    @Override
    public int getMagicDamage() {

        return character.getMagicDamage();
    }
}