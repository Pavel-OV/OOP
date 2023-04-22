package OOP_04;

import java.util.Random;

public abstract class Warrior extends Persanage{
    protected static Random rnd = new Random();
    protected Weapon weapon;
    private Armour armour;
    public  Warrior(String name, int hp, Weapon weapon, Armour armour ){
        super(name, hp);
        this.weapon=weapon;
        this.armour=armour;
    }
    public int harm(){                           // попал в цель
        boolean isHit = rnd.nextBoolean();
        int damage=0;
        if(isHit){
            damage = rnd.nextInt(weapon.damage()+1);
            }
        return damage;
        }
   
        public void reduse(int damage){
            
        }

        // public int reflection(){
        //     return reflection;
        // }    //отражение урона
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
    
