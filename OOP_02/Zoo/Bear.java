public class Bear extends Predator {

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
}
