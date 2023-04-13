public class Woof extends Predator implements Walkable{

    public Woof(String name) {
        super(name);
       
    }
@Override
public String speak(){
    return "УУУУУУ";
}
@Override
public int speed() {
   return 40;
}
}