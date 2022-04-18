package Week_02.Pokemon;

public class Ponyta extends Pokemons implements N_Attacks, Fire{
    Ponyta(String name, String type01, String ability, int pokeIndex, int attackAmount, int attack, int defense, int specialAttack, int specialDefense, int speed, int hp) {
        super(name, type01, ability, pokeIndex, attackAmount, attack, defense, specialAttack, specialDefense, speed, hp);
    }

    @Override
    public void flameCharge() {
        System.out.println("Flame Charge" +
                "\nDoes damage and raises the user speed by 1 level.");
    }

    @Override
    public void flameWheel() {
        System.out.println("\nFlame Wheel" +
                "\nHas 10% chance of burning the target.");
    }

    @Override
    public void headButt() {
        System.out.println("\nHeadbutt" +
                "\nDoes damage and has 30% chance of causing the target to flych.");
    }

    @Override
    public void quickAttack() {
        System.out.println("\nQuick Attack" +
                "\nLets the user attack first.");
    }

    public static void main(String[] args) {
        showPonyta();
    }
    public static void showPonyta(){
        Ponyta ponyta = new Ponyta("Ponyta","Fire","Flash Fire",77,
                4,85,55,65,65,90,50);
        System.out.println("--- Pokemon ---" +
                "\nName: " + ponyta.name +
                "\nTypes: " + ponyta.type01 + " / " + ponyta.type02 +
                "\nAbility: " + ponyta.ability +
                "\nPokedex Index: #" + ponyta.pokeIndex +
                "\n--- Basic Stats ---" +
                "\nAttack: " + ponyta.attack +
                "\nDefense: " + ponyta.defense +
                "\nSpecial Attack: " + ponyta.specialAttack +
                "\nSpecial Defense: " + ponyta.specialDefense +
                "\nSpeed: " + ponyta.speed +
                "\nHp: " + ponyta.hp +
                "\n--- Moves ---" +
                "\nAttakcs: " + ponyta.attackAmount);
        ponyta.flameCharge();
        ponyta.flameWheel();
        ponyta.quickAttack();
        ponyta.headButt();
    }
}
