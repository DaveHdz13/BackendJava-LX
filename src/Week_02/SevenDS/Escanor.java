package Week_02.SevenDS;

public class Escanor extends Character{
    // passiveSkill = Description
    String passiveSkill, weapon;

    Escanor( String passiveSkill, String weapon, int attack, int defense, int hp, String name, String race, String attribute, String team) {
        super(attack, defense, hp, name, race, attribute, team);
        this.passiveSkill = passiveSkill;
        this.weapon = weapon;
    }

    // Every skill has: Name, Rank, Damage and Skill
    @Override
    public void skill01() {
        System.out.println("\n-- Skill 01 --" +
                "\nElegant Blow" +
                "\nRank 1: 240%" +
                "\nRank 2: 300% /Effect: Fills Ultimate Move Gauge" +
                "\nRank 3: 500% /Effect: Fills Ultimate Move Gauge (by 2 orbs)");
    }

    @Override
    public void skill02() {
        System.out.println("\n-- Skill 02 --" +
                "\nCruel Sun" +
                "\nRank 1: 180% /Effect: Ignites for 3 turns." +
                "\nRank 2: 180% /Effect: Removes Buffs and Ignites for 3 turns." +
                "\nRank 3: 300% /Effect: Removes Buffs and Ignites for 4 turns.");
    }

    @Override
    public void special01() {
        System.out.println("\n-- Special 01 --" +
                "\nPunishment" +
                "\nInflicts damage equal to 840% of Attack");
    }

    @Override
    public void special02() {
        System.out.println("\n-- Special 02 --" +
                "\nGentleman's Dignity" +
                "\nInflicts damage equal to 960% of Attack");
    }

    static class Main {
        public static void main(String[] args) {
            showEscanor();
        }
        static void showEscanor(){
            Escanor escanor = new Escanor("Becomes immune when Ultimate Move Gauge is full.","Hacha Recia",580,380, 7000,
                    "Holy Knight Escanor","Human","PS","The Seven Deadly Sins");
            escanor.level();
            System.out.println("Name: " + escanor.name +
                    "\nPassive Skill: " + escanor.passiveSkill +
                    "\nWeapon: " + escanor.weapon +
                    "\n--- Base Statistics ---" +
                    "\nAttack: " + escanor.attack +
                    "\nDefense: " + escanor.defense +
                    "\nHp: " + escanor.hp +
                    "\n--- Base Characteristics ---" +
                    "\nRace: " + escanor.race +
                    "\nAttribute: " + escanor.attribute +
                    "\nTeam: " + escanor.team +
                    "\n--- Unique Skills ---");
            escanor.skill01();
            escanor.skill02();
            escanor.special01();
            escanor.special02();
        }
    }
}
