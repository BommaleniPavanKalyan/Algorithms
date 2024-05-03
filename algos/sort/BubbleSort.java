package algos.sort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {6,45,6,7,2,9,24,67};
		sort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public static void sort(int[] arr) {
		for(int i =0; i < arr.length-1;i++) {
			for(int j = 0;j<arr.length-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
