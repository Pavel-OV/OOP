package Aquarim;
public abstract class Сreature {
    private String title;
   
    public abstract String feed();
    public abstract String counter();
    public abstract String weight();
    public abstract String movement();


    public Сreature(String title) {
        this.title = title;
    }
   @Override
   public String toString() {
    StringBuilder spisok = new StringBuilder();
        spisok.append(String.format("Животное %s", this.title))
            .append(String.format("\nЕст %s",feed()))
            .append(String.format("вес %s",weight()))
            .append(String.format("Движение %s",movement()));

     
       return spisok.toString();
   }
}
