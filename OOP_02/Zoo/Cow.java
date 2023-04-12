public class Cow  extends Verbivore{

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
}
