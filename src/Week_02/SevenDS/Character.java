package Week_02.SevenDS;

public abstract class Character {
    // Base stats for every character
    int attack, defense, hp;
    String name, race, attribute, team;
    // Constructor
    Character(int attack, int defense, int hp, String name, String race, String attribute, String team) {
        this.attack = attack;
        this.defense = defense;
        this.hp = hp;
        this.name = name;
        this.race = race;
        this.attribute = attribute;
        this.team = team;
    }

    // Special skills
    public abstract void skill01();
    public abstract void skill02();
    public abstract void special01();
    public abstract void special02();

    // Basic level start
    public void level(){
        System.out.println("Base Level: Lv.1");
    }
}
