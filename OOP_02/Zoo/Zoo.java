import java.util.ArrayList;
import java.util.List;

public class Zoo
{
private List <Animal>animals= new ArrayList<>();

    // public Zoo(List <Animmal> animals){
    //     this.animals=animals;
    // }

    // public Zoo(String name) {
    //     super(name);
    // }
 public void addAnimals(Animal newAnimal ){
    this.animals.add(newAnimal); }

    public void shwoAll(){
        for(Animal animal:this.animals){
            System.out.println(animal);
        }
    }

    public void nois(){
        for(Animal animmal: animals){
            System.out.println(animmal.speak());
        }
    }
    
}
