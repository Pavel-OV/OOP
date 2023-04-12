import java.util.ArrayList;
import java.util.List;

public class Zoo
{
private List <Animmal>animals= new ArrayList<>();

    // public Zoo(List <Animmal> animals){
    //     this.animals=animals;
    // }

    // public Zoo(String name) {
    //     super(name);
    // }
 public void addAnimals(Animmal newAnimal ){
    this.animals.add(newAnimal); }

    public void shwoAll(){
        for(Animmal animal:this.animals){
            System.out.println(animal);
        }
    }

    public void nois(){
        for(Animmal animmal: animals){
            System.out.println(animmal.speak());
        }
    }
    
}
