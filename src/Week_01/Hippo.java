package Week_01;

public class Hippo {
    // Characteristics
    public String animalClass, feeding, size, behavior, bodyCov, mainPhysicChar, mainAbility;
    // Quadruped
    public int limbs;

    public String getAnimalClass(){  return animalClass;  }
    public String getFeeding(){  return feeding;  }
    public String getSize(){  return size;  }
    public String getBehavior(){  return behavior;  }
    public String getBodyCov(){  return bodyCov;  }
    public String getMainPhysicChar(){  return mainPhysicChar;  }
    public String getMainAbility(){  return mainAbility;  }
    public int getLimbs() {  return limbs;  }

    // Limbs = 4 (quadruped animal)
    public boolean setLimbs(int limbs){
        if (limbs == 4){
            this.limbs = limbs;
            return true;
        } else
            return false;
    }
    // Animal Class = mammal
    public boolean setAnimalClass(String animalClass){
        if (!animalClass.isEmpty()){
            this.animalClass = animalClass;
            return true;
        } else
            return false;
    }

    // Feeding = herbivorous
    public boolean setFeeding(String feeding){
        if (!feeding.isEmpty()){
            this.feeding = feeding;
            return true;
        } else
            return false;
    }

    // Size = bulky
    public boolean setSize(String size){
        if (!size.isEmpty()){
            this.size = size;
            return true;
        } else
            return false;
    }

    // Behavior = aggressive
    public boolean setBehavior(String behavior){
        if (!behavior.isEmpty()){
            this.behavior = behavior;
            return true;
        } else
            return false;
    }

    // Main Physic Characteristic = big jaw
    public boolean setMainPhysicChar(String mainPhysicChar){
        if (!mainPhysicChar.isEmpty()){
            this.mainPhysicChar = mainPhysicChar;
            return true;
        } else
            return false;
    }

    // Body Cover = just skin
    public boolean setBodyCov(String bodyCov){
        if (!bodyCov.isEmpty()){
            this.bodyCov = bodyCov;
            return true;
        } else
            return false;
    }

    // Main Ability = Excellent swimmer
    public boolean setMainAbility(String mainAbility){
        if (!mainAbility.isEmpty()){
            this.mainAbility = mainAbility;
            return true;
        } else
            return false;
    }

    public String printState(){
        return "Animal Class: " + animalClass + "\n" +
                "Feeding: " + feeding + "\n" +
                "Size: " + size + "\n" +
                "Behaviour: " + behavior + "\n" +
                "Body Cover: " + bodyCov + "\n" +
                "Main Physic Characteristic: " + mainPhysicChar + "\n" +
                "Main Ability: " + mainAbility;
    }
}
