
// Создать интерфейс, скорость плаванья
// Добавить новое животное, способное плавать
// Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
// *** Написать аквариум или террариум по аналогии с семинаром.
// (***) - Дополнительное задание, кому показалось мало

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimals(new Cow("Бурёнка"));
         zoo.addAnimals(new Bear("Михайло Потапыч"));
           zoo.addAnimals(new Platypus("Утконос"));
           zoo.addAnimals(new Goat("Маня"));
        zoo.noise();
        zoo.shwoAll();
    }
    
}
