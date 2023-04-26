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
        archers.addPers(new Archer("Робен", 100, new Bow(15), new AshberryShield()))
                .addPers(new Archer("Гуд", 100, new Bow(15), new AshberryShield()));
        thiefteam.addPers(new Thief("Джек", 150, new Knife(), new AshberryShield()))
                .addPers(new Thief("Япончик", 145, new Knife(), new OakShield()));
        System.out.println(archers);
        System.out.println(thiefteam);
        Archer robin = new Archer("Робин", 60, new Bow(25), new AshberryShield());
        Archer gut = new Archer("Гуд", 60, new Bow(25), new AshberryShield());
        Battle fight = new Battle(robin, gut);
        fight.run();

    }
}
