public class Goat  extends Herbivore implements Walkable{

    public Goat(String name) {
        super(name);
    }

    public String speak() {
        return "Бееее";
    }

    @Override
    public int runSpeed() {
        return 15;
    }
}
