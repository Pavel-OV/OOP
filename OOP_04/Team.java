package OOP_04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Persanage> implements Iterable<T> {
    List<T> personages = new ArrayList<>();

    @Override
    public Iterator<T> iterator() {
        return personages.iterator();

    }

    public Team<T> addPers(T personage) {
        this.personages.add(personage);
        return this;

    }

    @Override
    public String toString() {
        StringBuilder lst = new StringBuilder();
        for (T personage : this) {
            lst.append(personage)
                    .append("\n");
        }
        lst.append(String.format("Максимальное расстояние стрельбы %d",maxRange()));

        return lst.toString();
    }
 public int maxRange(){
    int max=0;
    for (T pers:this){
        if(pers instanceof Archer){
            Archer archer=(Archer)pers;
            if(archer.range()> max){
                max =archer.range();

            }

        }
    }
    return max;
 }
    
}
