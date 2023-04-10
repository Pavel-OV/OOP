package VendingMachine;

public class ConcentreMilk  extends Product{

    public ConcentreMilk(String name, double price, Integer wt,Integer count) {
        super(name, price, wt,count);
    }

    @Override
    public String toString() {
        StringBuilder lst = new StringBuilder();
        lst.append("cгущёка ")
            .append(super.toString());
       
           return lst.toString();      
        }        
    
    
}
