package OOP_04;

import java.util.Random;

public abstract class Shield implements ShieldProperties {
    protected Random rnd = new Random();
    protected String name;
    private int armor;
    private int endurance; 
    protected int protection;

    public Shield(String name, int armor, int endurance, int protection) {
        this.armor = armor;
        this.name = name;
        this.endurance = endurance; 
    }

   


    public int armor() {
        return armor;
    }

    public boolean impactReflection() { 
        while (endurance > 0) {
            return true;
        }
        return false;
    }
    @Override
     public void reducedEndurance(){  
        this.endurance = rnd.nextInt(15);
        if (this.endurance<=0){
            this.endurance=0;

        }
     } 
   
     @Override
     public int endurance(){ 
         return endurance;
     }

    @Override
    public String toString() {

        return String.format(" Защита щитом: %s. прочность щита: %d ", protection(),  endurance);
    }

}
