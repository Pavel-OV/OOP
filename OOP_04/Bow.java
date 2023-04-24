package OOP_04;

public class Bow  extends Throwing{
    private String name;
    public Bow(int range) {
        super(range);
        this.name="Лук";
    }
    @Override
    public int damage() {
        return 20;
    }
@Override
public String toString() {
   StringBuilder lst = new StringBuilder();
   lst.append(name)
        .append(String.format("\n\t %s",super.toString()));
    return lst.toString();
}
    
    
    
}
