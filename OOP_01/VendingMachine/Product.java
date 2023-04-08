package VendingMachine;

public class Product {
    private String name;
    private double price;
    private Integer wt;
   

    public Product(String name, double price,Integer wt) {
        this.name = name;
        this.price = price;
        this.wt= wt;
    }

     
    public Integer getVolume() {
        return wt;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setVolume(Integer wt) {
        this.wt = wt;
    }
    @Override
    public String toString() {
        
        return String.format("%s %s % .2f p",name, wt, price);
    }
}
