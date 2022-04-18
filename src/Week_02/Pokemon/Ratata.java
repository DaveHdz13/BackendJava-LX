package Week_02.Pokemon;

public class Ratata extends Pokemons implements N_Attacks{
    Ratata(String name, String type01, String ability, int pokeIndex, int attackAmount, int attack, int defense, int specialAttack, int specialDefense, int speed, int hp) {
        super(name, type01, ability, pokeIndex, attackAmount, attack, defense, specialAttack, specialDefense, speed, hp);
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
        showRattata();
    }
    public static void showRattata(){
        Ratata rattata = new Ratata("Rattata","Normal","Run Away",19,
                4,56,35,25,35,72,30);
        System.out.println("--- Pokemon ---" +
                "\nName: " + rattata.name +
                "\nTypes: " + rattata.type01 + " / " + rattata.type02 +
                "\nAbility: " + rattata.ability +
                "\nPokedex Index: #" + rattata.pokeIndex +
                "\n--- Basic Stats ---" +
                "\nAttack: " + rattata.attack +
                "\nDefense: " + rattata.defense +
                "\nSpecial Attack: " + rattata.specialAttack +
                "\nSpecial Defense: " + rattata.specialDefense +
                "\nSpeed: " + rattata.speed +
                "\nHp: " + rattata.hp +
                "\n--- Moves ---" +
                "\nAttakcs: " + rattata.attackAmount);
        rattata.headButt();
        rattata.quickAttack();
    }
}
