package OOP_04;

public class Archer  extends Warrior {

    public Archer(String name, int hp, Throwing weapon, Armour armour) {
        super(name, hp, weapon, armour);
        
    }
    public int range(){
        return rnd.nextInt(((Throwing)this.weapon).range)+1;

    }
    
}
