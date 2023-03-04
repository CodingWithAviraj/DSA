
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {8,7,6,5,4,3,2,1};
		int n = arr.length;
		
		insertionSort(arr, n);
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	private static void insertionSort(int[] arr, int n) {
		
		for(int i=1; i<n; i++){
		    int temp = arr[i];
		    int j = i-1;
		   while(j>=0) {
			   if(arr[j]> temp) {
				   arr[j+1] = arr[j];
			   }else {
				   break;
			   }
			   j--;
		   }
		   arr[j+1] = temp;
		}
	}

}
