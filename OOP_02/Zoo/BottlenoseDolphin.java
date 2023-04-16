public class BottlenoseDolphin extends ToothedWhales implements Floatable,Divesable{

    public BottlenoseDolphin(String name) {
        super(name);
       
    }
    @Override
    public String speak(){
        return "Тр-у-гр";
    }
    
    @Override
    public int swimmSpeed(){
        return 55;
    }
    @Override
    public int dives(){
        return 100;
    }
    
    @Override
    public String feed() {
        return "Рыба, рачки, устрицы";}
        
}
