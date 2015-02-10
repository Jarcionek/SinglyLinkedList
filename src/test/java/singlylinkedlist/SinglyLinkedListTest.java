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

}
