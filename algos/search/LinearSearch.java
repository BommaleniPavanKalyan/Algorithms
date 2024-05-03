package algos.search;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int key = sc.nextInt();
		
		int[] arr = {6,45,6,7,2,9,24,67};
		System.out.println(search(arr,key));
		
	}
	public static int search(int[] arr,int key) {
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] == key ) return i;
		}
		return -1;
	}

}
