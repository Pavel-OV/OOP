public class Bat extends Predator implements Flyable {

    public Bat(String name) {
        super(name);
      
    }
    @Override
    public String feed(){
        return "Насикомые";
    }

    @Override
    public String speak() {
       return "пииииии";
    }
    @Override
    public int flySpeed(){
        return 70;
    }
}
