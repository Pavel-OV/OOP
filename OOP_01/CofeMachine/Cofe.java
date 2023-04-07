package CofeMachine ;

public class Cofe extends Product{
    

    public Cofe(String name,Integer volume, Integer temperature,double  price) {
        super(name,volume,temperature,price);
        //TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        StringBuilder priceLlist =new StringBuilder();
        priceLlist.append("Кофе ")
            .append(super.toString());
        return priceLlist.toString() ;
    }
}
