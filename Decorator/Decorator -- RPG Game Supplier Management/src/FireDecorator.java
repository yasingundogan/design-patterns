/**
 * Concrete Decorator
 *
 * Adds a Fire Enchantment.
 *
 * Bonus:
 * +50 Fire Damage
 */
public class FireDecorator
        extends CharacterDecorator {

    public FireDecorator(
            Character character) {

        super(character);
    }

    @Override
    public String getDescription() {

        return character.getDescription()
                + ", Fire Enchantment";
    }

    @Override
    public int getAttack() {

        return character.getAttack();
    }

    @Override
    public int getDefense() {

        return character.getDefense();
    }

    @Override
    public int getMagicDamage() {

        return character.getMagicDamage()
                + 50;
    }
}