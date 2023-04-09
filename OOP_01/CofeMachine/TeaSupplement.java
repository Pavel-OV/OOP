package CofeMachine;

public class TeaSupplement extends Product{

    private String  supplement;
    public TeaSupplement(String name,  String supplement, Integer volume, Integer temperature, double price,Integer quantity) {
        super(name,volume, temperature, price, quantity);
        this.supplement =supplement;
        //TODO Auto-generated constructor stub
    }

 
   @Override
   public String toString() {
       // TODO Auto-generated method stub
       return String.format("%s %s",supplement, super.toString());
   }
}
