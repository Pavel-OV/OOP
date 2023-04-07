package CofeMachine;

import java.util.ArrayList;
import java.util.List;


public class CofeMachine{
    private List <Product> products =new ArrayList<>();
    private double maney;

    public CofeMachine addProduct(Product product){
        products.add(product);
        return this;

    }


    public Product searchProduct(String name) {
        for(Product item: products){
            if(item.getName().equals(name));{
                
            return item;
            }
        }
       return null;     
    }
@Override
public String toString() {
    StringBuilder res = new StringBuilder();
    for(Product item: products){
        res.append(item);
        res.append("\n");
    }

    // TODO Auto-generated method stub
    return res.toString();
}

}