
// Создать интерфейс, скорость плаванья
// Добавить новое животное, способное плавать
// Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
// *** Написать аквариум или террариум по аналогии с семинаром.
// (***) - Дополнительное задание, кому показалось мало

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimals(new Cow("Бурёнка"));
         zoo.addAnimals(new Bear("Михайло Потапыч",60));
           zoo.addAnimals(new Platypus("Утконос"));
           zoo.addAnimals(new Goat("Коза Маня"));
           zoo.addAnimals(new Woof("Волчара Серый"));
           zoo.addAnimals(new Bat(" Серая летучая"));
           zoo.addAnimals(new Bear(" Потапыч",61));
        zoo.noise();
        zoo.shwoAll();
        System.out.println();
        System.out.println("Чемпион по бегу");
        System.out.println(zoo.championByRun());
        System.out.println();
        System.out.println("Чемпион по полёту");
        System.out.println(zoo.championByFly());

    
    }
    
}
