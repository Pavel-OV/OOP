public abstract  class Predator extends Animmal {

    public Predator(String name) {
        super(name);
       
    }
    @Override
    public String feed(){
        return "Мясо";
        }
}
