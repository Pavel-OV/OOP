import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();
    private Radio radio =new Radio();

    // public Zoo(List <Animmal> animals){
    // this.animals=animals;
    // }

    // public Zoo(String name) {
    // super(name);
    // }
    public void addAnimals(Animal newAnimal) {
        this.animals.add(newAnimal);
    }

    public void shwoAll() {
        for (Animal animal : this.animals) {
            System.out.println(animal);
        }
    }

    public void noise() {
        for (Speakrable speak : noises()) {
            System.out.println(speak.speak());
        }
    }
 private List<Speakrable> noises(){
    List<Speakrable> res =new ArrayList<>();
    for(Speakrable item: animals){
        res.add(item);
           }
res.add(radio);
return res;
 }
}
