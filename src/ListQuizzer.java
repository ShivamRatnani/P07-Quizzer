import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Iterable;

public class ListQuizzer implements Iterable<MultipleChoiceQuestion>{
    private LinkedNode<MultipleChoiceQuestion> head;
    private ListingMode listingMode;
    private int size;
    private LinkedNode<MultipleChoiceQuestion> tail;

    public ListQuizzer() {
        this.head = null;
        this.listingMode = ListingMode.All;
        this.size = 0;
        this.tail = null;
    }

    public boolean isEmpty() {
        if (size != 0) return false;
        else return true;
    }

    public int size() {
        return this.size;
    }

    public void switchMode(ListingMode listingMode) {
        this.listingMode = listingMode;
    }

    public void add(MultipleChoiceQuestion multipleChoiceQuestion) throws NullPointerException,IndexOutOfBoundsException{

        if (multipleChoiceQuestion == null) throw new NullPointerException("MultipleChoiceQuestion is null");
        if (this.size >)

        if (this.head == null) {
            this.head = new LinkedNode<MultipleChoiceQuestion>(multipleChoiceQuestion);
            this.tail = this.head;
        }
        else {
            this.tail.setNext(new LinkedNode<MultipleChoiceQuestion>(multipleChoiceQuestion));
            this.tail = this.tail.getNext();
        }
        this.size++;
    }

}
