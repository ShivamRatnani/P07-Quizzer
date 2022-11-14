import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LinkedNode<T> {
    private T data;
    private LinkedNode<T> next;


    LinkedNode(T data) {
        this.data = data;
        this.next = null;
    }

    LinkedNode(T data, LinkedNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return this.data;
    }

    public LinkedNode<T> getNext() {
        return this.next;
    }

    public void setNext(LinkedNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        if (this.next == null) {
            return this.data.toString();
        }
        else {
            return this.data.toString() + " -> " + this.next.toString();
        }
    }


}
