package algorithm.fun;


public class MergeSortApp {

    public static void main(String[] args) {
        int maxSize = 100;
        DArray arr;
        arr = new DArray(maxSize);

        arr.insert(23);
        arr.insert(24);
        arr.insert(43);
        arr.insert(12);
        arr.insert(79);
        arr.insert(55);
        arr.insert(63);
        arr.insert(89);
        // arr.insert(0);

        arr.display();

        arr.mergeSort();

        System.out.println("********************* Sorted below ***********************");

        arr.display();
    }

}
