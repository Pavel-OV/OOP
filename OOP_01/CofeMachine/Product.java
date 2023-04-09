package CofeMachine;

public class Product {
    private String name;    
    private Integer volume;
    private Integer temperature;
    private String  supplement;
    private double price;
   
    private Integer quantity;  // количество товаров


    


    public Product(String name, Integer volume,Integer temperature, double price,Integer quantity) {
        this.price = price;
        this.name = name;
        this.volume=volume;
        this.temperature=temperature;
        this.quantity= quantity;
    }
     
    
    
    public boolean setQuantity(){
        quantity--;
        return quantity>0;
    }

    public void setSupplement(String supplement) {
        this.supplement = supplement;
    }


    public void setVolume(Integer volume) { // подумать над приватностью
        this.volume = volume;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

   
    public void setPrice(double price) {
        this.price = price;
    }

    private void setName(String name) {
        this.name = name;
    }

   
    
    public String getSupplement() {
        return supplement;
    }


    public Integer getVolume() {
        
        return volume;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s : %s мл, температура напитка %s  - % .2f p. колличества % шт ", 
        name,volume, temperature,price, quantity);

    }

}
