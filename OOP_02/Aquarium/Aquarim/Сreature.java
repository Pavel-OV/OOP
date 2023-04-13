package Aquarim;
public abstract class Сreature {
    private String title;
    private Integer counter;
   
    public abstract String feed();
    
    
    public abstract String movement();


    public Сreature(String title,Integer counter) {
        this.title = title;
        this.counter = counter;
    }
   @Override
   public String toString() {
    StringBuilder spisok = new StringBuilder();
        spisok.append(String.format("Животное\n %s", this.title))
            .append(String.format("\nЕст %s ",feed()))            
            .append(String.format("\nДвижение %s ",movement()))
            .append(String.format("\nКолличество %d",this.counter));

     
       return spisok.toString();
   }
}
