package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MissingElement {
	
	static void sortArray(int arr[]) {
		int swap;
		int n = arr.length;
		for(int i=0;i< n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
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
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements inside the array, make sure it should be in between 0 to n range: ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		sortArray(arr);
		System.out.println("Sorted array is as follows: " + Arrays.toString(arr));
		//to find the missing element 
		
		for(int i =arr[0]; i<n;i++) {
			if(arr[i]!= i) {
				System.out.println("Missing element: "+i);
				break;
			}
//			System.out.println(i);
		}
		
		

	}

}
