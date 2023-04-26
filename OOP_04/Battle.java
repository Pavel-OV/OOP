package OOP_04;

public class Battle {
    private Warrior attaker;
    private Warrior defender;

    public Battle(Warrior attacker, Warrior defender) {

        this.attaker = attacker;
        this.defender = defender;
    }

    public Persanage run() {

        while (true) {
            int attak = attaker.harm();
            defender.reduceHp(attak);
            if (!defender.isAlive()) {
                System.out.printf("Воин %s погиб\n", defender.getName());
                System.out.printf("Победитель:%s", attaker);
                return attaker;
            }
            System.out.printf("Воин %S наносит %d уронa \n у воина %s здоровья %s \n прочность щита : %d \n", attaker.getName(), attak,
                    defender.getName(),defender.getHp() ,defender.protect.endurance());
            int response = defender.harm();
            attaker.reduceHp(response);
            if (!attaker.isAlive()) {
                System.out.printf("Воин %s погиб\n", attaker.getName());
                System.out.printf("Победитель: %s", defender);
                return defender;
            }
            System.out.printf("\tВоин %S наносит ответный удар : %d уронa \n\t у воина %s оствлось здоровья %s\n\t прочность щита : %d \n",
                    defender.getName(),response, attaker.getName(), attaker.getHp(), attaker.protect.endurance());
        }

    }
}
