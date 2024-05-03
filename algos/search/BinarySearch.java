package algos.search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int key = sc.nextInt();
		
		int[] arr = {6,45,6,7,2,9,24,67};
		Arrays.sort(arr);
		System.out.println(search(arr,key));
		
	}
	public static int search(int[] arr, int key) {
		int first =0, last =arr.length-1;
		while(first <= last) {
			int mid = first+last;
			if(arr[mid] == key) return mid;
			else if(key < arr[mid]) last = mid - 1;
			else first = mid +1;
		}
		return -1;
	}

}
