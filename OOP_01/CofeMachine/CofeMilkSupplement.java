package CofeMachine;
public class CofeMilkSupplement extends CofeMilk{
    private String supplement;

    public CofeMilkSupplement(String name, String supplement
    ,Integer volume, Integer temperature, double price,Integer quantity) {
        super(name, volume, temperature, price, quantity);
        this.supplement=supplement;

    }

   
    @Override
    public String toString() {
        return String.format("%s %s",super.toString(),supplement);
    }


}