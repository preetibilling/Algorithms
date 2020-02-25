package algorithm.fun;


public class DoublyLinkedList {

    LinkD first;
    LinkD last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long dd) {
        LinkD newLink = new LinkD(dd);

        if (isEmpty()) {
            last = newLink;
        } else {
            first.prev = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(long dd) {
        LinkD newLink = new LinkD(dd);

        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
            newLink.prev = last;
        }
        last = newLink;
    }

    public LinkD deleteFirst() {
        LinkD temp = first;

        if (first.next == null) {
            last = null;
        } else {
            first.next.prev = null;
        }
        first = first.next;

        return temp;
    }

    public LinkD deleteLast() {
        LinkD temp = last;

        if (first.prev == null) {
            first = null;
        } else {
            last.prev.next = null;
        }
        last = last.prev;
        return temp;
    }

    public boolean insertAfter(long key, long dd) {
        LinkD current = first;
        while (current.dData != key) {
            current = current.next;
            if (current == null)
                return false;
        }

        LinkD newLink = new LinkD(dd);

        if (current == last) {
            newLink.next = null;
            last = newLink;
        } else {
            newLink.next = current.next;
            current.next.prev = newLink;
        }
        newLink.prev = current;
        current.next = newLink;
        return true;
    }

    public LinkD deleteKey(long key) {
        LinkD current = first;
        while (current.dData != key) {
            current = current.next;
            if (current == null)
                return null;
        }

        if (current == first) {
            first = current.next;
        } else {
            current.prev.next = current.next;
        }

        if (current == last) {
            last = current.prev;
        } else {
            current.next.prev = current.prev;
        }

        return current;
    }

    public void displayForward() {
        LinkD current = first;

        System.out.println(" Displaying first --> to Last --> ");
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("  ");

    }

    public void displayBackward() {
        LinkD current = last;

        System.out.println(" Displaying Last --> to First --> ");
        while (current != null) {
            current.displayLink();
            current = current.prev;
        }
        System.out.println("  ");
    }
}
