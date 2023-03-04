
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {8,7,6,5,4,3,2,1};
		int n = arr.length;
		
		bubbleSort(arr, n);
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	private static void bubbleSort(int[] arr, int n) {
		
		for(int i=0; i<n-1; i++) {
			boolean flag = false;
			for(int j=0; j<n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					flag = true;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(flag == false)break;
		}
	}

}
