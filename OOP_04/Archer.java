package OOP_04;

public class Archer extends Warrior<Throwing, ShieldProperties> {

    public Archer(String name, int hp, Throwing weapon, Shield protect) {
        super(name, hp, protect, weapon);

    }

    public int range() {
        return rnd.nextInt(this.weapon.range) + 1;

    }

    @Override
    public String toString() {

        return super.toString();
    }

}
