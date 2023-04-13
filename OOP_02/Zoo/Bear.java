public class Bear extends Predator implements Walkable {

    public Bear(String name) {
        super(name);
        
    }
    @Override
    public String speak(){
        return"РРРРР";
    }
    @Override
    public String feed(){
        return "всеяден: мясо, ягоды";
    }
    @Override
    public int speed() {
      return 60;
    }
    
}
