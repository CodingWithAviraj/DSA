
public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {8,7,6,5,4,3,2,1};
		int n = arr.length;
		
		quickSort(arr, 0, n-1);
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	private static void quickSort(int[] arr, int s, int e) {
	    if(s>=e) return;
	    
	    int p = partition(arr, s, e);
	    quickSort(arr, s, p-1);
	    quickSort(arr, p+1, e);
	}

	private static int partition(int[] arr, int s, int e) {
		int pivot= arr[e];
		
		int i= s-1;
		for(int j=s; j<=e-1; j++) {
			if(arr[j]<= pivot) {
				i++;
				//swap
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, e);
		return i+1;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;	
	}

}
