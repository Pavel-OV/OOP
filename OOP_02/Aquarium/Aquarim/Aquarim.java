package Aquarim;
import java.util.ArrayList;
import java.util.List;

public class Aquarim {
    private List<Сreature> creaturs = new ArrayList<>();

    // public Aquarim(List<Animmal2> animmals) {
    //     this.animmals = animmals;
    // }

    public void addCreaturs(Сreature creaturs) {
        this.creaturs.add(creaturs);
    }

    public void shwoCreatursAll() {
        for (Сreature creature : this.creaturs) {
            System.out.println(creature);
        }
    }

}
