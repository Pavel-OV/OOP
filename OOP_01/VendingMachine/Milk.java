package VendingMachine;

public class Milk extends Product {

    public Milk(String name, double price, Integer wt,Integer count) {
        super(name, price, wt, count);
        
    }

   @Override
   public String toString() {
      
       return  String.format("молоко %s ",  super.toString());
   }
    
}
