package com.arrays;

import java.util.*;


public  class TwoSum {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements inside an array: ");
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the target element you want to find sum of: ");
		int target = sc.nextInt();
		for(int i = 0 ;i<n;i++) {
			for(int j = 0;j<n-i-1; j++) {
				if(arr[j] + arr[j+1] == target) {
					System.out.println(arr[j] + arr[j+1]);
				}
				else {
					System.out.println("Number could not be found.");
				}
				
			}
		}

	}

	
	

}
