package algos.sort;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {6,45,8,7,2,9,24,67};
		sort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public static void sort(int[] arr) {
		if(arr.length == 1 ) return;
		int[] left = new int[arr.length/2];
		int[] right = new int[arr.length-left.length];
		for(int i = 0; i < left.length;i++) {
			left[i] = arr[i];
		}
		for(int j = 0; j < right.length;j++) {
			right[j] = arr[left.length+j];
		}
		sort(left);
		sort(right);
		merge(left,right,arr);
	}
	private static void merge(int[] a, int[] b, int[] c) {
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) c[k++] = a[i++];
			else c[k++] = b[j++];
		}
		while(i<a.length) c[k++] = a[i++];
		while(j<b.length) c[k++] = b[j++];
	}

}
