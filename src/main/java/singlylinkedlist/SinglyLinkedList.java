package singlylinkedlist;

public class SinglyLinkedList {

    private int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void append(String data) {
        size++;
    }

}
