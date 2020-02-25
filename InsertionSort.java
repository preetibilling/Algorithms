package algorithm.fun;

public class InsertionSort {

    public static void main(String args[]) throws InterruptedException {

        int arr[] = { 4, 1, 3, 6, 2 };
        insertionSort(arr);

    }

    public static void insertionSort(int arr[]) {
        int in, out;

        for (out = 1; out < arr.length; out++) {
            in = out;
            int temp = arr[out];

            while (in > 0 && arr[in - 1] >= temp) {
                arr[in] = arr[in - 1];
                --in;
            }
            arr[in] = temp;
        }
        
        System.out.println("Sorted array is " + arr.toString());
    }
}
