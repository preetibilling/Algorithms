package algorithm.fun;

public class ArraySh {
	private long[] theArray; // ref to array theArray
	private int nElems; // number of data items

	public ArraySh(int max) {
		theArray = new long[max];
		nElems = 0;
	}

	// --------------------------------------------------------------
	public void insert(long value) {
		theArray[nElems] = value;
		nElems++;
	}

	// --------------------------------------------------------------
	public void display() // displays array contents
	{
		System.out.print("A=");
		for (int j = 0; j < nElems; j++) // for each element,
			System.out.print(theArray[j] + " "); // display it System.out.println(“”);
	}

	public void shellSort() {
		int inner, outer;
		long temp;
		int h = 1;
		while (h <= nElems / 3)
			h = h * 3 + 1;

		while (h > 0) {
			for (outer = h; outer < nElems; outer++) {
				temp = theArray[outer];
				inner = outer;
				// one subpass (eg 0, 4, 8)
				while (inner > h - 1 && theArray[inner - h] >= temp) {
					theArray[inner] = theArray[inner - h];
					inner -= h;
				}
				theArray[inner] = temp;
			} // end for
			h = h - 1 / 3;
		} // end while(h>0) } // end shellSort()
	}
}
