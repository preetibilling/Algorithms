package algorithm.fun;

public class LinkedList {

    Link first;

    LinkedList() {
        first = null;
    }

    public void insertFirst(int id, double dd) {
        Link newLink = new Link(dd);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link find(int key) {
        Link current = first;

        // while (current.iData != key) {
        // current = current.next;
        // }
        return current;
    }

    public Link delete(int key) {
        Link current = first;
        Link previous = first;

        // while (current.iData != key) {
        // previous = current;
        // if (current.iData == key) {
        // previous = current.next;
        // current = current.next;
        // }
        // current = current.next;
        // }

        return null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void displayLinkedList() {
        Link current = first;

        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }
}
