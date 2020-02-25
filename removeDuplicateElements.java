package algorithm.fun;

import java.util.function.Supplier;

public class removeDuplicateElements {

    public static void main(String[] args) {
        int arr[] = { 3, 2, 2, 3 };
        //searchAndRemoveElement(arr, 3);
        Supplier<Integer> suppTest = () -> {
                return 42;
        };
        

    }

    private int searchAndRemoveElement(int[] arr, int val) {
        int length = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                length = length - 1;
            }
        }
        System.out.println(length);
        return length;
    }

}
