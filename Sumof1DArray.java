package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sumof1DArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] result = new int[n];
		System.out.println("Enter the elements inside an array: ");
		for(int i = 0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		result[0] = arr[0]; // start with the first element
		for (int i = 1; i < arr.length; i++) {
		    result[i] = result[i - 1] + arr[i]; // add the current element to the accumulated sum
		}
		System.out.println(Arrays.toString(result));

				}
		
	}
	


