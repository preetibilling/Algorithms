package algorithm.fun;


public class LinkListApp {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(1, 22);
        linkedList.insertFirst(2, 44);
        linkedList.insertFirst(3, 99);
        linkedList.insertFirst(4, 65);

        linkedList.displayLinkedList();

        while (!linkedList.isEmpty()) {
            Link deletedOne = linkedList.deleteFirst();
            System.out.println("Deleted " + deletedOne);
            deletedOne.displayLink();
        }
    }
}
