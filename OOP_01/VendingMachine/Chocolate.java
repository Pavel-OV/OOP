package VendingMachine;

public class Chocolate extends Product {
    private String te;

    public Chocolate(String name, String te,Integer wt, double price,Integer count) {
        super(name, price, wt, count);
        this.te = te;
    }

    // public String getTaste() {
    // return taste;
    // }

    // public void setTaste(String taste) {
    // this.taste = taste;
    // }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s,%s",  super.toString(),te);
    }

}
