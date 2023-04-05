package CofeMachine ;

public class Cofe extends Product{

    public Cofe(String name,double price) {
        super(name,price );
        //TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Капучино %s",super.toString()) ;
    }
}
