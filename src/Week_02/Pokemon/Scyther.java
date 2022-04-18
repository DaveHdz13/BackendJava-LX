package Week_02.Pokemon;

public class Scyther extends Pokemons implements N_Attacks, Bug, Flying{
    Scyther(String name, String type01, String type02, String ability, int pokeIndex, int attackAmount, int attack, int defense, int specialAttack, int specialDefense, int speed, int hp) {
        super(name, type01, type02, ability, pokeIndex, attackAmount, attack, defense, specialAttack, specialDefense, speed, hp);
    }

    @Override
    public void furyCutter() {
        System.out.println("\nFury Cutter" +
                "\nDoes damage and for each turn it multiplies x2 (max 4 turns).");
    }

    @Override
    public void xScissor() {
        System.out.println("\nX-Scissor" +
                "\nDoes damage.");
    }

    @Override
    public void wingAttack() {
        System.out.println("\nWing Attack" +
                "\nDoes damage.");
    }

    @Override
    public void aerialAce() {
        System.out.println("\nAerial Ace" +
                "\nDoes damage without failing.");
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
        showScyther();
    }
    public static void showScyther(){
        Scyther scyther = new Scyther("Scyther","Bug","Flying","Swarm",
                123,4,110,80,55,80,105,70);
        System.out.println("--- Pokemon ---" +
                "\nName: " + scyther.name +
                "\nTypes: " + scyther.type01 + " / " + scyther.type02 +
                "\nAbility: " + scyther.ability +
                "\nPokedex Index: #" + scyther.pokeIndex +
                "\n--- Basic Stats ---" +
                "\nAttack: " + scyther.attack +
                "\nDefense: " + scyther.defense +
                "\nSpecial Attack: " + scyther.specialAttack +
                "\nSpecial Defense: " + scyther.specialDefense +
                "\nSpeed: " + scyther.speed +
                "\nHp: " + scyther.hp +
                "\n--- Moves ---" +
                "\nAttakcs: " + scyther.attackAmount);
        scyther.furyCutter();
        scyther.aerialAce();
        scyther.headButt();
        scyther.quickAttack();
    }
}
