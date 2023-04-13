public class Platypus  extends Mammal implements Walkable {

    public Platypus(String name) {
        super(name);
        
    }
    
@Override
public String speak(){
    return "Буль булт"; 
}

@Override
public String feed() {
   
    return "Трава, рвба";
}

@Override
public int speed() {
   return 7;
}
}
