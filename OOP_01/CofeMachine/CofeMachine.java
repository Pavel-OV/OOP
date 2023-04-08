package CofeMachine;

import java.util.ArrayList;
import java.util.List;


public class CofeMachine{
    private List <Product> products =new ArrayList<>();
    private double maney=0;

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
       public Product sellProduct(String name) {
        Product target = searchProduct(name);
        this.maney+=target.getPrice();
        return target;        
       }    
    
@Override
public String toString() {
    StringBuilder res = new StringBuilder();
    for(Product item: products){
        res.append(item);
        res.append("\n");
    }

    res.append(String.format("\nВ автомате находится %.2f p", maney));

    // TODO Auto-generated method stub
    return res.toString();
    
}

}