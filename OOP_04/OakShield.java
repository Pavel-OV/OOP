package OOP_04;
public class OakShield extends Shield{

    public OakShield(){
        super("щит из дуба",45,25,25);


    }
    @Override
    public int protection(){
        if(impactReflection()) return 15;
        else return 0;
    }
    @Override
    public String toString() {
        StringBuilder lst = new StringBuilder();
        lst.append(this.name)
                .append(String.format("\n\t%s", super.toString()));
        return lst.toString();
    }
       
    }

