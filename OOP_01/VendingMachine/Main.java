// На основе кода с урока добавить еще один класс продукта, 
// (Молоко, шоколад ,и т.п., можно добавить несколько классов), 
// они должны наследоваться от класса Product, 
// надо переопределить метод toString и попробовать 
// включить эти классы в VendingMachine,
//  вывести список товаров из VendingMachine
package VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine mart = new VendingMachine();
        mart.addProduct(new Product("Круaсан", 160, 220))
                .addProduct(new Chocolate("Шоколад", 100, 95, "горький"));
        System.out.println(mart);

    }
}