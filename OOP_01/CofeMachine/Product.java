package CofeMachine;

public class Product {
    private double price;
    private String name;
    private Integer volume;
    private Integer temperature;


    public Product(String name, Integer volume,double price) {
        this.price = price;
        this.name = name;
        this.volume=volume;
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
        return String.format("%s : %s мл % .2f p.", name,volume, price);

    }

}
