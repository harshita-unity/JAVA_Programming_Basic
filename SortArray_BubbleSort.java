package com.arrays;
import java.util.*;

public class SortArray_BubbleSort {
	
	static void bubbleSort(int arr[]) {
		int swap = 0;
		int n = arr.length;
		for(int i = 0;i<n-1;i++) {
			for(int j = 0; j <n-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					swap = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = swap;
				}
				
				}
			}
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		SortArray_BubbleSort sb = new SortArray_BubbleSort();
		System.out.println("Enter the number of elements in an array: " );
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in an array: ");
		for(int i = 0; i<n ; i++) {
			arr[i] = sc.nextInt();
		}
	bubbleSort(arr);	
	System.out.println("After sorting array: " + Arrays.toString(arr));
	}

}
