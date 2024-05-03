package algos.sort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {6,45,8,7,2,9,24,67};
		sort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public static void sort(int[] arr) {
		for(int i =0;i <arr.length-1;i++) {
			int index = i;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[j] < arr[index]) index = j;
			}
			if(i!=index) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] =temp;
			}
		}
	}

}
