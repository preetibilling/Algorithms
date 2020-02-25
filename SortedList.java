package algorithm.fun;


public class SortedList {

    private Link first;

    public SortedList(Link[] linkArray) {
        for (int i = 0; i < linkArray.length; i++) {
            insert(linkArray[i]);
        }
    }

    public void insert(Link link) {
        Link previous = null;
        Link current = first;

        while (current != null && current.doubleData > link.doubleData) {
            previous = current;
            current = current.next;
        }

        if (previous == null) {
            first = link;
        } else {
            previous.next = link;
            link.next = current;
        }
    }

    public Link remove() {
        Link temp = first;
        first = first.next;
        return temp;
    }

}
