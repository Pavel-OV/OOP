public abstract class Animal implements Speakrable {
    private String name;
   // private boolean alive;

    
   
    public abstract String feed();



    public Animal(String name) {
        this.name = name;
       // this.alive = alive;
    }
    
    @Override
    public String toString() {
        StringBuilder lst = new StringBuilder();
        lst.append(String.format("Кличка животного %s\n",name))
            .append(String.format("ест пищу %s\n",this.feed()))
            .append(String.format("издаёт звуки %s\n",this.speak()));
       
        return lst.toString();
    }
}


