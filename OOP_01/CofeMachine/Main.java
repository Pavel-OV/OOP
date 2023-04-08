package CofeMachine;
// *** Создать торговый кофейный автомат, напитки в автомате должны содержать следующие данные: 
// наименование, объем, температура, цена.
//  Проинициализировать несколько напитков в классе main и торговый автомат,
//   воспроизвести логику продажи напитков. Сделать на основе ООП
public class Main {
    public static void main(String[] args) {
        CofeMachine mart = new CofeMachine();
        System.out.println("До продажи в автомате находится  ");
        
        mart.addProduct(new Product("Горячий шоколад",300,95, 90 ))
            .addProduct(new Cofe("Американо",300,98,50))
            .addProduct(new Cofe("Эспрессо",100,98,40))
            .addProduct(new Product("Чай",300, 98,30))
            .addProduct(new CofeMilkSupplement("Капучино","ваниль",300,98,85))
            .addProduct(new CofeMilk("c молоком",300,98,75))
            .addProduct(new TeaSupplement("чай","С мятой",300,99,30));


        System.out.println(mart);
        System.out.println("Выбераем из списка ");
        System.out.println( mart.searchProduct("горячий шоколад"));
        System.out.println("Покупаем ");
        System.out.println(mart.sellProduct("горячий шоколад"));
        System.out.println(mart);
    }
}
// cappuccino
// hot chocolate
