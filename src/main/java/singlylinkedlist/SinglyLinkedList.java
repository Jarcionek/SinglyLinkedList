package singlylinkedlist;

public class SinglyLinkedList {

    private boolean isEmpty = true;

    public boolean isEmpty() {
        return isEmpty;
    }

    public int size() {
        return isEmpty ? 0 : 1;
    }

    public void append(String data) {
        isEmpty = false;
    }

}
