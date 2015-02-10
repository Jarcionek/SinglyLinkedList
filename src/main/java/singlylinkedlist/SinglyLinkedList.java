package singlylinkedlist;

public class SinglyLinkedList {

    private int size = 0;
    private String head = null;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void append(String data) {
        head = data;
        size++;
    }

    public String get(int index) {
        return head;
    }

}
