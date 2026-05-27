/**
 * Concrete Decorator
 *
 * Adds a Holy Blessing.
 *
 * Bonus:
 * +20 Defense
 * +30 Holy Damage
 */
public class HolyDecorator
        extends CharacterDecorator {

    public HolyDecorator(
            Character character) {

        super(character);
    }

    @Override
    public String getDescription() {

        return character.getDescription()
                + ", Holy Blessing";
    }

    @Override
    public int getAttack() {

        return character.getAttack();
    }

    @Override
    public int getDefense() {

        return character.getDefense()
                + 20;
    }

    @Override
    public int getMagicDamage() {

        return character.getMagicDamage()
                + 30;
    }
}