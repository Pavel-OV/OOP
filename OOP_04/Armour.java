package OOP_04;

public abstract class Armour implements Shield{
    int armor;

    public Armour(int armor) {
        this.armor = armor;
    }

    public int getArmor() {  //до 50 мин
        return armor;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Защитное вооружение %s. Броня %d ", reflection(),getArmor());
    }
    
}
