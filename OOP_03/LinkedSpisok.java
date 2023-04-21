package OOP_03;
import java.util.Iterator;

public class LinkedSpisok <E> implements Iterable <E>{

    private SpisokElement head;
    private SpisokElement finite;
    private int count = 0;

    @Override
    public Iterator <E>iterator() {
        return new Iterator<E>() {
          
            SpisokElement spisokelement = new SpisokElement(count);
            {
                spisokelement.setNext(head);
            }
            SpisokElement currentElement = spisokelement;

            @Override
            public boolean hasNext() {
                return currentElement.getNext() != null;
            }

            @Override
            public E next() {
                currentElement = currentElement.getNext();
                return (E) currentElement.getData();
            }
        };
    }

    public int size() {
        return count;
    }

    private SpisokElement getElement(int index){
        if (index >= count){
            throw new IndexOutOfBoundsException();
        }

        SpisokElement result = head;
        for (int i = 1; i <= index; i++){
            result = result.getNext();
        }
        return result;
    }

    public Integer get(int index){

        SpisokElement element = getElement(index);

        return element.getData();
    }

    public void remove(int index){

        SpisokElement currentElement = getElement(index);
        SpisokElement nextElement = currentElement.getNext();
        SpisokElement previousElement = currentElement.getPrevious();

        if (index == 0){
            head = nextElement;
            if (finite == currentElement){
                finite = null;
            }
        }

        if (index == count - 1){
            finite = previousElement;
            if (head == currentElement){
                head = null;
            }
        }

        count--;

        if (nextElement != null){
            nextElement.setPrevious(previousElement);
        }

        if (previousElement != null){
            previousElement.setNext(nextElement);
        }

    }

    public void add(int index, Integer dt){
        if (count == index){
            add(dt);
            return;
        }
        count++;

        SpisokElement currentElement = new SpisokElement(dt);

        if (index == 0){
            head = currentElement;
        }

        SpisokElement nextElement = getElement(index);
        SpisokElement previousElement = nextElement.getPrevious();

        currentElement.setNext(nextElement);
        currentElement.setPrevious(previousElement);

        if (previousElement != null) {
            previousElement.setNext(currentElement);
        }

    }

    public void add(Integer dt){
        count++;
        SpisokElement element = new SpisokElement(dt);
        if (head == null){
            head = element;
            finite = element;
            return;
        } else if (finite == null) {
            finite = element;
            return;
        }

        finite.setNext(element);
        element.setPrevious(finite);
        finite = element;
    }

}
