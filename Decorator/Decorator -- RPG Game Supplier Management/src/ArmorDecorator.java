/**
 * Concrete Decorator
 *
 * Adds Steel Armor.
 *
 * Bonus:
 * +40 Defense
 */
public class ArmorDecorator
        extends CharacterDecorator {

    public ArmorDecorator(
            Character character) {

        super(character);
    }

    @Override
    public String getDescription() {

        return character.getDescription()
                + ", Steel Armor";
    }

    @Override
    public int getAttack() {

        return character.getAttack();
    }

    @Override
    public int getDefense() {

        return character.getDefense()
                + 40;
    }

    @Override
    public int getMagicDamage() {

        return character.getMagicDamage();
    }
}