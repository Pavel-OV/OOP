package VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List <Product> products = new ArrayList<>();
    private double maney=0;


    public void sell(String name){
        Product target = searchProduct(name);

    }

    public Product searchProduct(String name){
        for(Product item: products){
            if(item.getName().equals(name)){
                return item;
            }
            return null;

        }
    }
    
}
