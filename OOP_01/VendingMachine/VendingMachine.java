package VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List <Product> products = new ArrayList<>();
    private double maney=0;

    public VendingMachine  addProduct(Product product){
        products.add(product);
        return this;
    }


    public Product sell(String name){
        Product target = searchPruduct(name);
        this.maney+=target.getPrice();
        return target;

    }

    public Product searchPruduct(String name){
        for(Product item: products){
            if(item.getName().equals(name)){
                return item;
            }
        }
            return null;

        }
    
    @Override
    public String toString() {
        StringBuilder lst =new StringBuilder();
       for(Product item:products){
        lst.append(item);
        lst.append("\n");        
       }
        lst.append("В автомате сейчас "+maney +" p \n");
        return lst.toString();
    }
}
