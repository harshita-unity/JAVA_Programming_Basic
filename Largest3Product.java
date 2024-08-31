package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Largest3Product {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of an array: ");
		int n = sc.nextInt();
		int product =0;
		int[] arr = new int[n];
		System.out.println("Enter the elements present inside an array: ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		for(int i = 0;i<n;i++) {
			product = arr[n-3] * arr[n-2] * arr[n-1];
		}
		System.out.println(product);

	}

}
