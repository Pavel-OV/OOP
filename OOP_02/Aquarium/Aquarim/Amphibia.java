package Aquarim;

public abstract class Amphibia extends Vertebrata {
//cvakushka
    public Amphibia(String title) {
        super(title);
       
    }
    @Override
    public String feed(){
        return"насикомые";
    }
    @Override
    public String movement() {
       
        return "Прыгает";
    }
} 
