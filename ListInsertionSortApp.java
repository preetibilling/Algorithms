package algorithm.fun;


public class ListInsertionSortApp {

    public static void main(String[] args) {

        int size = 10;
        Link[] linkArray = new Link[size];
        for (int i = 0; i < size; i++) {
            int n = (int) (Math.random() * 99);
            Link link = new Link(n);
            linkArray[i] = link;
        }

        System.out.println("Unsorted array: ");
        for (int j = 0; j < size; j++) {
            System.out.println(linkArray[j].doubleData + " ");
        }

        // Pass the unsorted array to SortedList

        SortedList sortedList = new SortedList(linkArray);

        for (int j = 0; j < size; j++) {
            linkArray[j] = sortedList.remove();
        }

        System.out.println("Sorted array: ");
        for (int j = 0; j < size; j++) {
            System.out.println(linkArray[j].doubleData + " ");
        }
    }
}
