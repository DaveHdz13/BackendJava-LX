package Week_01.Animal;

public class Animal {
    /*
    * Feeding = Herbivorous or Carnivorous
    * Body Cover = Skin or Fur
    * Animal Class = Mammal, Reptile, Fish, Arachnid, etc.
    * */
    public String feeding, bodyCover, animalClass;

    Animal(String feeding, String bodyCover, String animalClass){
        this.feeding = feeding;
        this.bodyCover = bodyCover;
        this.animalClass = animalClass;
    }
}
