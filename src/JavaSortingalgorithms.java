import java.util.LinkedList;

public class JavaSortingalgorithms {

	public static void main(String[] args) {

		/*
		 * Selection Sort
		 */
		// System.out.println("Selection Sort");
		// SelectionSort ob = new SelectionSort();
		// int arr[] = {64,25,12,22,11};
		// ob.sort(arr);
		// System.out.println("Sorted array");
		// ob.printArray(arr);

		/*
		 * Bubble Sort
		 */
		// System.out.println("Bubble Sort");
		// BubbleSort ob = new BubbleSort();
		// int arr[] = {64, 34, 25, 12, 22, 11, 90};
		// ob.bubbleSort(arr);
		// ob.bubbleSort(arr,arr.length);
		// System.out.println("Sorted array");
		// ob.printArray(arr);
		// System.out.println("Sorted array (Optimized)");
		// ob.printArray(arr,arr.length);

		/*
		 * Recursive Bubble Sort
		 */
		// System.out.println("Recursive Bubble Sort");
		// RecursiveBubbleSort ob = new RecursiveBubbleSort();
		// int arr[] = {64, 34, 25, 12, 22, 11, 90};
		// ob.bubbleSort(arr,arr.length);
		// System.out.println("Sorted array");
		// ob.printArray(arr);

		/*
		 * Merge Sort
		 */
		// System.out.println("Merge Sort");
		// int arr[] = {12, 11, 13, 5, 6, 7};
		//
		// System.out.println("Given Array");
		// printArray(arr);
		//
		// MergeSort ob = new MergeSort();
		// ob.sort(arr, 0, arr.length-1);
		//
		// System.out.println("\nSorted array");
		// printArray(arr);

		/*
		 * Insertion Sort
		 */
		// System.out.println("Insertion Sort");
		// int arr[] = { 12, 11, 13, 5, 6 };
		//
		// System.out.println("Given Array");
		// printArray(arr);
		//
		// InsertionSort ob = new InsertionSort();
		// ob.sort(arr);
		//
		// System.out.println("\nSorted array");
		// printArray(arr);

		/*
		 * QuickSort
		 */
//		 System.out.println("Quick Sort");
//		 int arr[] = { 10, 7, 8, 9, 1, 5 };
//		 int n = arr.length;
//		
//		 QuickSort ob = new QuickSort();
//		 ob.sort(arr, 0, n - 1);
//		
//		 System.out.println("sorted array");
//		 printArray(arr);
		
		/*
		 * HeapSort
		 */
		System.out.println("Heap Sort");
		int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
 
        HeapSort ob = new HeapSort();
        ob.sort(arr);
 
        System.out.println("Sorted array is");
        printArray(arr);
		
	}

	/*
	 * Code below is to print the outcome.
	 */
	// Prints the array
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Function to print an array (Optmized Bubble Sort)
	void printArray(int arr[], int size) {
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
