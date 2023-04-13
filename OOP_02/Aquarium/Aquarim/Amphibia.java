package Aquarim;
import Vertebrata;

public abstract class Amphibia extends Vertebrata {
//cvakushka
    public Amphibia(String title) {
        super(title);
       
    }
    @Override
    public String feed(){
        return"насикомые";
    }
}
