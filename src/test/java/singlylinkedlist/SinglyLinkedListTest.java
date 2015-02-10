package singlylinkedlist;

import org.junit.Test;

import static com.shazam.shazamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class SinglyLinkedListTest {

    @Test
    public void isEmptyMethodOfNewListReturnsTrue() {
        SinglyLinkedList list = new SinglyLinkedList();

        assertThat(list.isEmpty(), is(equalTo(true)));
    }
    
    @Test
    public void sizeMethodOfNewListReturnsZero() {
        SinglyLinkedList list = new SinglyLinkedList();

        assertThat(list.size(), is(equalTo(0)));
    }

    @Test
    public void isEmptyMethodOfNonEmptyListReturnsFalse() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append("some data");

        assertThat(list.isEmpty(), is(equalTo(false)));
    }

    @Test
    public void sizeMethodOfListWithSingleElementReturnsCorrectResult() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append("data");

        assertThat(list.size(), is(equalTo(1)));
    }

    @Test
    public void sizeMethodOfListWithMultipleElementsReturnsCorrectResult() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append("1");
        list.append("2");
        list.append("3");

        assertThat(list.size(), is(equalTo(3)));
    }

    @Test
    public void getMethodOfListWithSingleElementReturnsThatElement() {
        String element = "the only element";

        SinglyLinkedList list = new SinglyLinkedList();
        list.append(element);

        assertThat(list.get(0), is(equalTo(element)));
    }

    @Test
    public void getMethodOfListWithMultipleElementsReturnsElementAtGivenIndex() {
        String thirdElement = "third element";

        SinglyLinkedList list = new SinglyLinkedList();
        list.append("first element");
        list.append("second element");
        list.append(thirdElement);
        list.append("fourth element");

        assertThat(list.get(2), is(equalTo(thirdElement)));

    }

}
