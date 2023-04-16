public class Phocidae extends Pinnipedia implements Walkable, Divesable,Floatable {

    Phocidae(String name) {
        super(name);
       
    }
    
    @Override
    public String speak() {
        return "Гр--уууу";
    }

    

    @Override
    public int runSpeed() {
        return 21;
    }
    @Override
    public int swimmSpeed(){
        return 32;
    }
    @Override
    public int dives(){
        return 8;
    }
    
}
