/**
 * Base Decorator
 *
 * Implements the same abstraction as Character.
 *
 * Stores another Character object and delegates
 * requests to it.
 *
 * Concrete decorators will extend this class
 * and add their own bonuses.
 */
public abstract class CharacterDecorator
        extends Character {

    // It's PROTECTED, so just base decorator and its subclasses can access.
    protected Character character;

    public CharacterDecorator(
            Character character) {

        this.character = character;
    }
}