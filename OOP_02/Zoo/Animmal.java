public abstract class Animmal {
    private String name;
   // private boolean alive;

    
    public abstract String  speek();
    public abstract String feed();



    public Animmal(String name, boolean alive) {
        this.name = name;
       // this.alive = alive;
    }
    
    @Override
    public String toString() {
       
        return String.format("Кличка", name);
    }
}


