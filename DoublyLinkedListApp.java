package algorithm.fun;


public class DoublyLinkedListApp {

    public static void main(String[] args) {
        DoublyLinkedList doublyList = new DoublyLinkedList();

        doublyList.insertFirst(20);
        doublyList.insertFirst(22);
        doublyList.insertFirst(25);

        doublyList.displayForward();

        doublyList.insertLast(99);
        doublyList.insertLast(67);
        doublyList.insertLast(55);

        doublyList.displayBackward();

        doublyList.insertAfter(99, 62);
        doublyList.displayForward();
    }

}
