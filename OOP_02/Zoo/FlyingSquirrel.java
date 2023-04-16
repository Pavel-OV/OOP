public class FlyingSquirrel extends Herbivore implements Flyable, Walkable {
    public FlyingSquirrel(String name) {
        super(name);

    }

    @Override
    public String speak() {
        return null;
    }

    @Override
    public int flySpeed() {
        return 35;

    }

    @Override
    public int runSpeed() {
        return 18;
    }

    @Override
    public String feed() {
        return "Орешки, семечки";
    }
}
