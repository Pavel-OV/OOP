package CofeMachine;
// *** Создать торговый кофейный автомат, напитки в автомате должны содержать следующие данные: 
// наименование, объем, температура, цена.
//  Проинициализировать несколько напитков в классе main и торговый автомат,
//   воспроизвести логику продажи напитков. Сделать на основе ООП
public class Main {
    public static void main(String[] args) {
        CofeMachine mart = new CofeMachine();
        mart.addProduct(new Product("горячий шоколад", 90 ))
            .addProduct(new Cofe("cappuccino",100))
            .addProduct(new Product("Чай", 35));
        System.out.println(mart);
    }
}
// cappuccino
// hot chocolate
