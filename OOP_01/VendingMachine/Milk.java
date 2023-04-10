package VendingMachine;

public class Milk extends Product {

    public Milk(String name, double price, Integer wt,Integer count) {
        super(name, price, wt, count);
        //TODO Auto-generated constructor stub
    }

   @Override
   public String toString() {
       // TODO Auto-generated method stub
       return  String.format("молоко %s ",  super.toString());
   }
    
}
