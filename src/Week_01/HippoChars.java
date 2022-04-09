package Week_01;

public class HippoChars {
    public static void main(String[] args) {
        show();
    }
    public static void show(){
        // Initialization of Hippo
        Hippo commonHippo = new Hippo();
        // Setting parameters
        commonHippo.setLimbs(4);
        commonHippo.setAnimalClass("Mammal");
        commonHippo.setBehavior("Aggressive");
        commonHippo.setFeeding("Herbivorous");
        commonHippo.setSize("Bulky");
        commonHippo.setBodyCov("Skin");
        commonHippo.setMainPhysicChar("Big Jaw");
        commonHippo.setMainAbility("Excellent Swimmer");
        // Getting parameters
        String msg = "I`m a common Hippo :D";
        msg += "\n" + "Limbs: " + commonHippo.getLimbs();
        msg += "\n" + "Animal Class: " + commonHippo.getAnimalClass();
        msg += "\n" + "Behavior: " + commonHippo.getBehavior();
        msg += "\n" + "Feeding: " + commonHippo.getFeeding();
        msg += "\n" + "Size: " + commonHippo.getSize();
        msg += "\n" + "Body Cover: " + commonHippo.getBodyCov();
        msg += "\n" + "Main Physic Characteristic: " + commonHippo.getMainPhysicChar();
        msg += "\n" + "Main Ability: " + commonHippo.getMainAbility();

        System.out.print(msg);
    }
}
