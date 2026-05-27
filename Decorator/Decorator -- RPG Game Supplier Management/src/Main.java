public class Main {

    public static void main(String[] args) {

        /*
         * Create the base character.
         *
         * Structure:
         *
         * Knight
         */
        Character character =
                new Knight();

        /*
         * Equip an Iron Sword.
         *
         * Structure:
         *
         * SwordDecorator
         *      |
         *    Knight
         */
        character =
                new SwordDecorator(
                        character);

        /*
         * Equip Steel Armor.
         *
         * Structure:
         *
         * ArmorDecorator
         *      |
         * SwordDecorator
         *      |
         * Knight
         */
        character =
                new ArmorDecorator(
                        character);

        /*
         * Apply Fire Enchantment.
         *
         * Final structure:
         *
         * FireDecorator
         *      |
         * ArmorDecorator
         *      |
         * SwordDecorator
         *      |
         * Knight
         */
        character =
                new FireDecorator(
                        character);

        printCharacter(character);
    }

    private static void printCharacter(
            Character character) {

        System.out.println(
                "Description: "
                        + character.getDescription());

        System.out.println(
                "Attack: "
                        + character.getAttack());

        System.out.println(
                "Defense: "
                        + character.getDefense());

        System.out.println(
                "Magic Damage: "
                        + character.getMagicDamage());
    }
}