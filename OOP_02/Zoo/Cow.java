public class Cow extends Herbivore implements Walkable {

    public Cow(String name) {
        super(name);
        
    }
    @Override
    public String speak() {
        return "Муууу";
       }
       @Override
       public String feed(){
        return "Трава";
       }
    @Override
    public int runSpeed() {
       return 20;
    }
}
