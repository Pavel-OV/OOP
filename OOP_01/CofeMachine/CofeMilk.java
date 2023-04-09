package CofeMachine;

   public class CofeMilk extends Cofe{
   

    public CofeMilk (String name,Integer volume,Integer temperature, double price,Integer quantity){
        super(name, volume,temperature, price,  quantity);
    }

    @Override
    public String toString() {
        StringBuilder priceLlist =new StringBuilder();
        priceLlist.append("")
        .append(super.toString());
                // TODO Auto-generated method stub
        return priceLlist.toString();
    }
}


