public class BlueWhale  extends BaleenWhales implements  Divesable, Floatable{

    public BlueWhale(String name) {
        super(name);
        
    }
    @Override
    public String speak(){
        return "УУУУУУУУ";
    }
    
    @Override
    public int swimmSpeed(){
        return 45;
    }
    @Override
    public int dives(){
        return 1000;
    }
    
}
