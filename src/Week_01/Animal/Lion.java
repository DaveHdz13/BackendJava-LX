package Week_01.Animal;

public class Lion extends Animal{
    public String name, physic1, physic2, physic3;
    int limbs;

    Lion(String feeding, String bodyCover, String animalClass, String name, String physic1, String physic2, String physic3, int limbs) {
        super(feeding, bodyCover, animalClass);
        this.name = name;
        this.physic1 = physic1;
        this.physic2 = physic2;
        this.physic3 = physic3;
        this.limbs = limbs;
    }

    public static void main(String[] args){
        show();
    }
    static void show(){
        Lion lion = new Lion("Carnivorous", "Fur", "Mammal", "Lion", "Tail", "Claws", "Big Fur", 4);
        System.out.println("Animal: " + lion.name +
                "\nFeeding Type: " + lion.feeding +
                "\nBody Cover: " + lion.bodyCover +
                "\nAnimal Class: " + lion.animalClass +
                "\nPhysics: " + lion.physic1 + ", " + lion.physic2 + ", " + lion.physic3 +
                "\nLimbs: " + lion.limbs);
    }
}
