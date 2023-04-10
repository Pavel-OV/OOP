package VendingMachine;

public class Product {
    private String name;
    private double price;
    private Integer wt;
    private Integer count;
   

    public Product(String name, double price,Integer wt, Integer count) {
        this.name = name;
        this.price = price;
        this.wt= wt;
        this.count= count;
    }

    public boolean sellCount(){
        this.count--;
        return count>0;
    }
    
    public Integer getVolume() {
        return wt;
    }

   

    public String getName() {
        return name;
    }

    // public Integer setCount(){
    //     this.count;
    // }

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
        
        return String.format("продукт %s вес %s гр. цена %.2f p ",name, wt, price);
    }
}
