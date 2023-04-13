public class Cow extends Verbivore implements Walkable {

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
    public int speed() {
       return 20;
    }
}
