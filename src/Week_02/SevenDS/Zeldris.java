package Week_02.SevenDS;

public class Zeldris extends Character{
    String passiveSkill, weapon;

    Zeldris(String passiveSkill, String weapon, int attack, int defense, int hp, String name, String race, String attribute, String team) {
        super(attack, defense, hp, name, race, attribute, team);
        this.passiveSkill = passiveSkill;
        this.weapon = weapon;
    }

    @Override
    public void skill01() {
        System.out.println("\n-- Skill 01 --" +
                "\nSlash Hack" +
                "\nRank 1: 160% /Effect: Spike damage" +
                "\nRank 2: 240% /Effect: Spike damage" +
                "\nRank 3: 400% /Effect: Spike damage");
    }

    @Override
    public void skill02() {
        System.out.println("\n-- Skill 02 --" +
                "\nInvisible Blade" +
                "\nRank 1: 100% /Effect: Despair damage" +
                "\nRank 2: 150% /Effect: Despair damage" +
                "\nRank 3: 250% /Effect: Despair damage");
    }

    @Override
    public void special01() {
        System.out.println("\n-- Special 01 --" +
                "\nReckless Line" +
                "\nInflicts Spike damage equal to 506%");
    }

    @Override
    public void special02() {}
    
    static class Main {
        public static void main(String[] args) {
            showZeldris();
        }
        static void showZeldris(){
            Zeldris zeldris = new Zeldris("Critical damage increased by 30% when the Ultimate Move Gauge is depledet","Espada de Zeldris",
                    600,420,7000,"The Ten Commandments Zeldris","Demon","Speed","The Ten Commandments");
            zeldris.level();
            System.out.println("Name: " + zeldris.name +
                    "\nPassive Skill: " + zeldris.passiveSkill +
                    "\nWeapon: " + zeldris.weapon +
                    "\n--- Base Statistics ---" +
                    "\nAttack: " + zeldris.attack +
                    "\nDefense: " + zeldris.defense +
                    "\nHp: " + zeldris.hp +
                    "\n--- Base Characteristics ---" +
                    "\nRace: " + zeldris.race +
                    "\nAttribute: " + zeldris.attribute +
                    "\nTeam: " + zeldris.team +
                    "\n--- Unique Skills ---");
            zeldris.skill01();
            zeldris.skill02();
            zeldris.special01();
        }
    }
}
