package VendingMachine;

public class Chocolate extends Product {
    private String taste;

    public Chocolate(String name, Integer wt, double price) {
        super(name, price,wt);
        this.taste = taste;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("", taste, super.toString());
    }

}
