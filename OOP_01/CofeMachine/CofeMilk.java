package CofeMachine;

   public class CofeMilk extends Cofe{

    public CofeMilk (String name,Integer volume, double price){
        super(name, volume, price);
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


