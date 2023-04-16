public class Platypus  extends Mammal implements Walkable,Floatable,Divesable {

    public Platypus(String name) {
        super(name);
        
    }
    
@Override
public String speak(){
    return "Буль буль"; 
}

@Override
public String feed() {
   
    return "Трава, рыба";
}

@Override
public int runSpeed() {
   return 7;
}
@Override
public int swimmSpeed() {
   return 25;
}

@Override
public int  dives(){
   return 4;
}
}
