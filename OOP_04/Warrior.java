package OOP_04;

import java.util.Random;

public abstract class Warrior <T extends Weapon ,S extends ShieldProperties> extends Persanage{
    protected static Random rnd = new Random();
    protected T weapon;
    protected S protect;
    public  Warrior(String name, int hp,  S protect,T weapon){
        super(name, hp, protect);
        this.weapon=weapon;
        this.protect =protect;
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
            .append(String.format("\n\t Вооружение %s", this.weapon))
            .append(String.format("\n\t Защитное вооружение : %s", this.protect));
        
        return lst.toString();
    }
    }
