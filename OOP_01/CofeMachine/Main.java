package CofeMachine;
// *** Создать торговый кофейный автомат, напитки в автомате должны содержать следующие данные: 
// наименование, объем, температура, цена.
//  Проинициализировать несколько напитков в классе main и торговый автомат,
//   воспроизвести логику продажи напитков. Сделать на основе ООП
public class Main {
    public static void main(String[] args) {
        CofeMachine mart = new CofeMachine();
        
        mart.addProduct(new Product("горячий шоколад",300,95, 90 ))
            .addProduct(new Cofe("Американо",300,98,50))
            .addProduct(new Cofe("Эспрессо",100,98,50))
            .addProduct(new Product("Чай",300, 45,98))
            .addProduct(new Product("Кипяток",300,98,20))
            .addProduct(new CofeMilk("c молоком",300,98,75))
            .addProduct(new TeaSupplement("чай","С мятой",300,99,30));


        System.out.println(mart);
        System.out.println(  mart.searchProduct("горячий шоколад"));
        
    }
}
// cappuccino
// hot chocolate
