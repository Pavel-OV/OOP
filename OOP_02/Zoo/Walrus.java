public  class Walrus extends Pinnipedia implements Walkable, Floatable, Divesable{

    public Walrus(String name) {
        super(name);
       
    }
    @Override
    public String speak(){
        return " Бр-Бр-ааа";
    }
    @Override
    public int runSpeed(){
        return 26;
    }
    @Override
    public int swimmSpeed(){
        return 34;
    }
    @Override
    public int dives(){
        return 10;
    }
    
}
