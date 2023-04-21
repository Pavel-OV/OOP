package OOP_03;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        LinkedSpisok linkedSpisok = new LinkedSpisok();
        linkedSpisok.add(1);
        linkedSpisok.add(2);
        linkedSpisok.add(3);
        linkedSpisok.add(5);

        linkedSpisok.add(1, 6);
        linkedSpisok.remove(3);


        Iterator<Integer> iterator = linkedSpisok.iterator();
        while (iterator.hasNext()){
            Integer element = iterator.next();
            System.out.println(element);
        }

    }
}