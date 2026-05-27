/**
 * Component
 *
 * Defines the common contract that both
 * concrete characters and decorators follow.
 *
 * Client code should always work with this abstraction.
 */
public abstract class Character {

    public abstract String getDescription();

    public abstract int getAttack();

    public abstract int getDefense();

    public abstract int getMagicDamage();
}