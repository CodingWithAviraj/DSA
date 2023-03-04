
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {8,7,6,5,4,3,2,1};
		int n = arr.length;
		
		selectionSort(arr, n);
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	private static void selectionSort(int[] arr, int n) {
		
		for(int i=0; i<n; i++) {
			int minVal = arr[i];
			int minIndex = i;
			for(int j=i+1; j<n; j++) {
				if(minVal > arr[j]) {
					minVal = arr[j];
					minIndex = j;
				}
			}
			//swap
			int temp = arr[i]; 
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}

}
