package OOP_04;

public class Main {
    // На основе работы на уроке.
    // Создать класс щита, разработать разные типы щитов,
    // добавить в семейство классов Warriors обобщения в виде щитов.
    // Реструктуризировать код в конечных классах семейства Warriors.
    // Добавить метод определения минимального щита члена команды в команде.
    // * Продумать, как можно сделать воина без щита.
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Thief> thiefteam = new Team<>();
        archers.addPers(new Archer("Робен",100, new Bow(20)))
        .addPers(new Archer("Гуд", 0100, new Bow(15) ));
        thiefteam.addPers(new Thief("Джек", 150,new Knife()))
        .addPers (new Thief("Япончик",145,new Knife()));
    System.out.println(archers);
    System.out.println(thiefteam);
    Archer robin = new Archer("Робин", 60,new Bow(25));
    Archer gut = new Archer("Гуд", 60,new Bow(25));
    Battle fight = new Battle(robin, gut);
    fight.run();


    
    }
}
