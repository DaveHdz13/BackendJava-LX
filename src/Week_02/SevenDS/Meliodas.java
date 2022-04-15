package Week_02.SevenDS;

public class Meliodas extends Character{
    String passiveSkill, weapon;
    
    Meliodas(String passiveSkill, String weapon, int attack, int defense, int hp, String name, String race, String attribute, String team) {
        super(attack, defense, hp, name, race, attribute, team);
        this.passiveSkill = passiveSkill;
        this.weapon = weapon;
    }

    @Override
    public void skill01() {
        System.out.println("\n-- Skill 01 --" +
                "\nChest Cuts" +
                "\nRank 1: 180% /Effect: Amplify damage" +
                "\nRank 2: 270% /Effect: Amplify damage" +
                "\nRank 3: 450% /Effect: Amplify damage");
    }

    @Override
    public void skill02() {
        System.out.println("\n-- Skill 02 --" +
                "\nSpinning Slash" +
                "\nRank 1: 100% /Effect: Pierce damage" +
                "\nRank 2: 150% /Effect: Pierce damage" +
                "\nRank 3: 250% /Effect: Pierce damage");
    }

    @Override
    public void special01() {
        System.out.println("\n-- Special 01 --" +
                "\nApocalypse" +
                "\nRemoves Buffs on all enemies. Decreases enemies stats by %5 for 2 turns with a damage equal to 585%");
    }

    @Override
    public void special02() {}

    static class Main {
        public static void main(String[] args) {
            showMeliodas();
        }
        static void showMeliodas(){
            Meliodas meliodas = new Meliodas("Single-target skills increase all stats by 6%","Espadón de Heroe",
                    620,380,6500,"Holy Warrior Meliodas","Demon","Darkness","The Seven Deadly Sins");
            meliodas.level();
            System.out.println("Name: " + meliodas.name +
                    "\nPassive Skill: " + meliodas.passiveSkill +
                    "\nWeapon: " + meliodas.weapon +
                    "\n--- Base Statistics ---" +
                    "\nAttack: " + meliodas.attack +
                    "\nDefense: " + meliodas.defense +
                    "\nHp: " + meliodas.hp +
                    "\n--- Base Characteristics ---" +
                    "\nRace: " + meliodas.race +
                    "\nAttribute: " + meliodas.attribute +
                    "\nTeam: " + meliodas.team +
                    "\n--- Unique Skills ---");
            meliodas.skill01();
            meliodas.skill02();
            meliodas.special01();
        }
    }
}
