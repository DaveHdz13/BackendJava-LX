package Week_01.Animal;

public class Spider extends Animal{
    int limbs;
    String name, size;

    Spider(String feeding, String bodyCover, String animalClass, int limbs, String name, String size) {
        super(feeding, bodyCover, animalClass);
        this.limbs = limbs;
        this.size = size;
        this.name = name;
    }
    public static void main(String[] args){
        show();
    }
    static void show(){
        Spider spider = new Spider("Hybrid", "Skin", "Arachnid", 6, "Spider", "Small");

        System.out.println("Animal: " + spider.name +
                "\nFeeding: " + spider.feeding +
                "\nBody Cover: " + spider.bodyCover +
                "\nAnimal Class: " + spider.animalClass +
                "\nSize: " + spider.size +
                "\nLimbs: " + spider.limbs);
    }
}
