package VendingMachine;

public class Chocolate  extends Product{
    private String taste;

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public Chocolate(String name, double price) {
        super(name, price);
        this.taste =taste;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("",taste, super.toString());
    }
    
}
