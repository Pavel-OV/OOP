package OOP_04;

public class Thief extends Warrior<Knife, ShieldProperties> {
    public Thief(String name, int np, Knife weapon, ShieldProperties protect) {
        super(name, np, protect, weapon);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
