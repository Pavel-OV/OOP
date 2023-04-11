public abstract class Animmal {
    private String name;
   
    private abstract  food();
    private abstract  counter();
    private abstract  weight();
    private abstract  movement();


    public Animmal(String name) {
        this.name = name;
    }
   @Override
   public String toString() {
       // TODO Auto-generated method stub
       return super.toString();
   }
}
