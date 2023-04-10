package CofeMachine;

import java.util.ArrayList;
import java.util.List;

public class CofeMachine {
    private List<Product> products = new ArrayList<>();
    private double maney = 0;

    public CofeMachine addProduct(Product product) {
        products.add(product);
        return this;

    }

    public Product searchProduct(String name) {
        for (Product item : products) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public Product sellProduct(String name) throws Exception {
        Product target = searchProduct(name);
        try {
            this.maney += target.getPrice();
            if(!target.setQuantity()){
                products.remove(target);
            }
        } catch (NullPointerException e) {
            throw new Exception("Товар не найден",e);
            //System.out.println("Товар не найден");
        }
        return target;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Product item : products) {
            res.append(item);
            res.append("\n");
        }

        res.append(String.format("\nВ автомате сейчас %.2f p", maney));

        return res.toString();

    }

}