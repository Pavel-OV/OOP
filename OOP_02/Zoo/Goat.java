public class Goat  extends Verbivore implements Walkable{

    public Goat(String name) {
        super(name);
    }

    public String speak() {
        return "Бееее";
    }

    @Override
    public int speed() {
        return 15;
    }
}
