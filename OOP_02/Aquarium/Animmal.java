public abstract class Animmal {
    private String name;
    private String food;
    private Integer counter;
    private Integer weight;
    private String movement;
    
    public Animmal(String name, String food, Integer counter, Integer weight, String movement) {
        this.name = name;
        this.food = food;
        this.counter = counter;
        this.weight = weight;
        this.movement = movement;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public Integer getCounter() {
        return counter;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getMovement() {
        return movement;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
