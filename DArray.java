package algorithm.fun;


public class DArray {

    private long[] theArray;
    private int nElems;

    public DArray(int max) {
        theArray = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        theArray[nElems] = value;
        nElems++;
    }

    public void display() {

        for (int i = 0; i < nElems; i++) {
            System.out.println(theArray[i] + " ");
        }
    }

    public void mergeSort() {
        long[] workspace = new long[nElems];
        recMergeSort(workspace, 0, nElems - 1);
    }

    private void recMergeSort(long[] workspace, int lowerbound, int upperbound) {
        if (lowerbound == upperbound) {
            return;
        } else {
            int mid = (lowerbound + upperbound) / 2;
            System.out.println(
                "mid value is " + mid + " for lowerBound as " + lowerbound + " and upperbound as " + upperbound);
            recMergeSort(workspace, lowerbound, mid);

            System.out.println(
                "After first recursion mid value is " + mid + " as lowerBound and upperbound as " + upperbound);
            recMergeSort(workspace, mid + 1, upperbound);

            merge(workspace, lowerbound, mid + 1, upperbound);

        }
    }

    private void merge(long[] workspace, int lowPtr, int highPtr, int upperbound) {

        int mid = highPtr - 1;
        int j=0;
        int lowerbound = lowPtr;
        int n = upperbound - lowerbound + 1;
        while (lowPtr <= mid && highPtr <= upperbound) {
            if (theArray[lowPtr] < theArray[highPtr])
                workspace[j++] = theArray[lowPtr++];
            else
                workspace[j++] = theArray[highPtr++];
        }

        while (lowPtr <= mid) {
            workspace[j++] = theArray[lowPtr++];
        }

        while (highPtr <= upperbound) {
            workspace[j++] = theArray[highPtr++];
        }

        for (j = 0; j < n; j++) {
            theArray[lowerbound + j] = workspace[j];
        }

    }
}
