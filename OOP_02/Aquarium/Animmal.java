public abstract class Animmal {
    private String name;
   
    public abstract String feed();
    public abstract Integer counter();
    public abstract  Integer weight();
    public abstract String movement();


    public Animmal(String name) {
        this.name = name;
    }
   @Override
   public String toString() {
    StringBuilder spisok = new StringBuilder();
        spisok.append(String.format("Животное %s", this.name))
            .append(String.format("Ест %s",feed()))
            .append(String.format("вес %s",weight()))
            .append(String.format("Движение %s",movement()));

     
       return spisok.toString();
   }
}
