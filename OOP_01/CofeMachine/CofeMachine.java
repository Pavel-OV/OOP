package CofeMachine;

import java.util.ArrayList;
import java.util.List;


public class CofeMachine{
    private List <Product> products =new ArrayList<>();

    public CofeMachine addProduct(Product product){
        products.add(product);
        return this;

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