package algos.sort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {6,45,8,7,2,9,24,67};
		sort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public static void sort(int[] arr) {
		for(int i = 1;i<arr.length;i++) {
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}

}
