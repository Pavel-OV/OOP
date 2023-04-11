public abstract class Animmal {
    private String name;
   // private boolean alive;

    
    public abstract String  speak();
    public abstract String feed();



    public Animmal(String name) {
        this.name = name;
       // this.alive = alive;
    }
    
    @Override
    public String toString() {
        StringBuilder lst = new StringBuilder();
        lst.append(String.format("Кличка животного %s",name))
            .append(String.format("ест пищу %s",this.feed()))
            .append(String.format("издаёт звуки %s",this.speak()));
       
        return lst.toString();
    }
}


