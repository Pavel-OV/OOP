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


    // public void sell(String name){
    //     Product target = searchProduct(name);

    // }

    // public Product searchProduct(String name){
    //     for(Product item: products){
    //         if(item.getName().equals(name)){
    //             return item;
    //         }
    //         return null;

    //     }
    // }
    @Override
    public String toString() {
        StringBuilder lst =new StringBuilder();
       for(Product item:products){
        lst.append(item);
        
       }
      
        return lst.toString();
    }
}
