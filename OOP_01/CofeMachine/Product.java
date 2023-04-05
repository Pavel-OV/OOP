package CofeMachine;

public class Product {
    private double price;
    private String name;

     

    public Product(String name, double price) {
        this.price = price;
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    private void setName(String name) {
        this.name = name;
    }
    public  double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return String.format("%s : % .2f p.",name,price);
        
    }
    
    
}
