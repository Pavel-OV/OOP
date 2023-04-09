package VendingMachine;

public class Milk extends Product {

    public Milk(String name, double price, Integer wt) {
        super(name, price, wt);
        //TODO Auto-generated constructor stub
    }

   @Override
   public String toString() {
       // TODO Auto-generated method stub
       return  String.format("молоко %s ",  super.toString());
   }
    
}
