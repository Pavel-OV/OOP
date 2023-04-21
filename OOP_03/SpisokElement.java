package OOP_03;

public class SpisokElement {

    private Integer data;
    private SpisokElement next;
    private SpisokElement previous;

    public SpisokElement(Integer data) {
        this.data = data;
    }

    public Integer getData() {
        return data;
    }

    public SpisokElement getNext() {
        return next;
    }

    public SpisokElement getPrevious() {
        return previous;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    void setNext(SpisokElement elementspiska) {
        next = elementspiska;
    }

    void setPrevious(SpisokElement elementspiska) {
        previous = elementspiska;
    }

}
