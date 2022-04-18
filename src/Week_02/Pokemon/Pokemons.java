package Week_02.Pokemon;

public class Pokemons {
    String name, type01, type02, ability;
    int pokeIndex, attackAmount, attack, defense, specialAttack, specialDefense, speed, hp;

    Pokemons(String name, String type01, String ability, int pokeIndex, int attackAmount, int attack, int defense, int specialAttack, int specialDefense, int speed, int hp){
        this.name = name;
        this.type01 = type01;
        this.ability = ability;
        this.pokeIndex = pokeIndex;
        this.attackAmount = attackAmount;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
        this.hp = hp;
    }
    Pokemons(String name, String type01, String type02, String ability, int pokeIndex, int attackAmount, int attack, int defense, int specialAttack, int specialDefense, int speed, int hp){
        this.name = name;
        this.type01 = type01;
        this.type02 = type02;
        this.ability = ability;
        this.pokeIndex = pokeIndex;
        this.attackAmount = attackAmount;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
        this.hp = hp;
    }
}
