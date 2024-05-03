package algos.sort;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {6,45,8,7,2,9,24,67};
		sort(arr,0,arr.length-1);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public static void sort(int[] arr,int start, int end) {
		if(start >= end) return;
		int pivot =arr[(start + end)/2];
		int i = start,j = end;
		while(i<j) {
			while(arr[i] < pivot) i++;
			while(arr[j] > pivot) j--;
			if(i<=j) {
				int temp = arr[i];
				arr[i] =arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			sort(arr,start,j);
			sort(arr,i,end);
		}
	}

}
