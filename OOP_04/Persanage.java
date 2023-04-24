package OOP_04;

public abstract class Persanage{
   
    private String name;
    private int hp;
    public Persanage(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public boolean isAlive(){
       return hp>0;

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

    public void reduceHp(int damage){
        this.hp-=damage;
        if(this.hp< 0){
            this.hp=0;
        }
        

    }

}