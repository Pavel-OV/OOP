package OOP_04;

public class AshberryShield extends Shield {
    public AshberryShield() {
        super("щит из рябины", 25, 25, 15);
    }

    @Override
    public int protection() {
        if (impactReflection())
            return 15;
        else
            return 0;
    }

    @Override
    public String toString() {
        StringBuilder lst = new StringBuilder();
        lst.append(this.name)
                .append(String.format("\n\t%s", super.toString()));
        return lst.toString();
    }

}