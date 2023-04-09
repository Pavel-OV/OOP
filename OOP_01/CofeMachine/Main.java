package CofeMachine;
// *** Создать торговый кофейный автомат, напитки в автомате должны содержать следующие данные: 
// наименование, объем, температура, цена.
//  Проинициализировать несколько напитков в классе main и торговый автомат,
//   воспроизвести логику продажи напитков. Сделать на основе ООП
public class Main {
    public static void main(String[] args) {
        CofeMachine mart = new CofeMachine();
        System.out.println("До продажи в автомате находится  ");
        
        mart.addProduct(new Product("Горячий шоколад",100,95, 90 ,3))
            .addProduct(new Cofe("Американо",300,98,50,2))
            .addProduct(new Cofe("Эспрессо",100,98,40,1))
            .addProduct(new Product("Чай",300, 98,30,3))
            .addProduct(new CofeMilkSupplement("Капучино","Ваниль",300,98,85,1))
            .addProduct(new CofeMilk("c молоком",300,98,75,2))
            .addProduct(new TeaSupplement("чай","С мятой",300,99,30,5));


        System.out.println(mart);
        System.out.println("Выбераем из списка ");
        System.out.println(mart.searchProduct("Горячий шоколад"));
        System.out.println("Покупаем \nВыводится снова список товаров \n ");
        mart.sellProduct("Горячий шоколад");
        System.out.println(mart+"\n");
        System.out.println("Ищем новый товар xлеб");
        System.out.println(mart.sellProduct("Хлеб"));
        System.out.println(mart);
        System.out.println("\nНам показалось мало, выбираем новый напиток");
        System.out.println(mart.searchProduct("Капучино"));
        mart.sellProduct("Капучино");
        System.out.println("Покупаем \nВыводится снова список товаров \n ");
        System.out.println(mart);
    }
}
// cappuccino
// hot chocolate
