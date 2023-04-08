package CofeMachine;
public class CofeMilkSupplement extends CofeMilk{
    private String supplement;

    public CofeMilkSupplement(String name, String supplement,Integer volume, Integer temperature, double price) {
        super(name, volume, temperature, price);
        this.supplement=supplement;

    }

    public String getSupplement() {
        return supplement;
    }

    public void setSupplement(String supplement) {
        this.supplement = supplement;
    }

    @Override
    public String toString() {
        return String.format("%s %s",supplement,super.toString());
    }


}