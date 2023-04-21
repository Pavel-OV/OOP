package OOP_04;

import java.util.Random;

public abstract class Warrior extends Persanage{
    private static Random rnd = new Random();
    private Weapon weapon;
    public  Warrior(String name, int hp, Weapon weapon){
        super(name, hp);
        this.weapon=weapon;
    }
    public int harm(){
        boolean isHit = rnd.nextBoolean();
        int damage=0;
        if(isHit){
            damage = rnd.nextInt(weapon.damage()+1);
            }
        return damage;
        }
   
        public void reduse(int damage){
            
        }
    @Override
    public String toString() {
        StringBuilder lst =new StringBuilder();
        lst.append("Воин \n")
            .append(getName())
            .append(String.format("\n\t Hp: %s", getHp()))
            .append(String.format("\n\t Вооружение %s", this.weapon));
        
        return lst.toString();
    }
    }
    
