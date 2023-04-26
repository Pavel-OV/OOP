package OOP_04;

import java.util.Random;

public abstract class Persanage {
    protected Random rnd = new Random();
    protected ShieldProperties protect;
    private String name;
    private int hp;

    public Persanage(String name, int hp, ShieldProperties protect) {
        this.name = name;
        this.hp = hp;
        this.protect = protect;
    }

    public boolean isAlive() {
        return hp > 0;

    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void reduceHp(int damage) {
        if (this.protect.impactReflection()) {
            int impactmitigation = rnd.nextInt(101);
            if (impactmitigation <= this.protect.armor()) {
                damage -= this.protect.protection();
                this.protect.reducedEndurance();
            }

        }

        this.hp -= damage;
        if (this.hp < 0) {
            this.hp = 0;
        }

    }

}