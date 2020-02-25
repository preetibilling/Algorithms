package algorithm.fun;

public class ShellSortApp {

	public static void main(String[] args) {
		int maxSize = 10;
		ArraySh arr;
		arr = new ArraySh(maxSize);
		for (int j = 0; j < maxSize; j++) {
			// array size
			// create the array
			// fill array with
			// random numbers
			long n = (int) (java.lang.Math.random() * 99);
			arr.insert(n);
		}
		arr.display();
		System.out.println(" ");		
		arr.shellSort();
		System.out.print("After Sorting "); // display it 
		System.out.println(" ");		
		arr.display();

	}

}
