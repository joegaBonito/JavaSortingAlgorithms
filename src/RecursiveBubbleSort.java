public class RecursiveBubbleSort {
	public void bubbleSort(int[] arr, int arraynum) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arraynum-1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		arraynum--;
		if( arraynum > 0) {
			bubbleSort(arr,arraynum);
		}
	}
}
