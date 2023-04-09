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
        System.out.println("В автомате сейчас есть в наличии");
        mart.addProduct(new Product("Круaсан", 160, 220))
                .addProduct(new Product("Сникерс", 40, 45))
                .addProduct(new Chocolate("Шоколад","Фундук",300,20))
                .addProduct(new Milk("Первый вкус",89,1000))
                .addProduct(new ConcentreMilk("Сгущённое молоко",63,350));
        System.out.println(mart);
        System.out.println("Ищем товар и его покупаем в случае наличея");
       
        System.out.println(mart.searchPruduct("Круaсан"));
        System.out.println("Покупаем\n");
        System.out.println("Ищем товар" );
        System.out.println(mart.searchPruduct("Первый вкус"));
        System.out.println("Покупаем\n");
        mart.sell("Круaсан");
        mart.sell("Первый вкус");
              
        System.out.println(mart);


    }

   
}