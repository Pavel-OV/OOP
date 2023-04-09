package CofeMachine;

public class Supplement  extends Product{
    private  String supplement;

    public Supplement(String name,String supplement, Integer volume, Integer temperature, double price,Integer quantity) {
        super(name, volume, temperature, price,quantity);
        this.supplement=supplement;
    }

    public String getVsupplement() {
        return supplement;
    }

    public void setVsupplement(String vsupplement) {
        this.supplement = vsupplement;
    }
    
}
