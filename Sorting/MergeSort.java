
public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {8,7,6,5,4,3,2,1};
		int n = arr.length;
		int[] temp = new int[n];
		mergeSort(arr,0, n-1, temp);

        for(int i=0; i<n; i++) {
        	System.out.print(arr[i] + " ");
        }
	}

	private static void mergeSort(int[] arr, int s, int e, int[] temp) {
		if(s>=e)return;
		int mid = (s+e)/2;
		mergeSort(arr, s, mid, temp);
		mergeSort(arr, mid+1, e, temp);
		merge(arr, s, mid, e, temp);
	}

	private static void merge(int[] arr, int s, int mid, int e, int[] temp) {
		int i=s, j=mid+1, k=i;
		
		while(i<=mid && j<=e) {
			if(arr[i]<arr[j]) {
				temp[k++] = arr[i++];
			}else {
				temp[k++] = arr[j++];
			}
		}
		
		while(i<=mid) {
			temp[k++] = arr[i++];
		}
		
		while(j<=e) {
			temp[k++] = arr[j++];
		}
		
		for(i=s; i<=e; i++) {
			arr[i] = temp[i];
		}
	}

}
