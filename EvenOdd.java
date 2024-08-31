package com.arrays;
import java.util.*;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of an array: ");
		int n = sc.nextInt();
		
		int i = 1;
		int[] arr = new int[n];
		System.out.println("The array items are as follows: ");
		for( i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Even numbers in an array: ");
		for( i = 0; i<n ; i++) {
//			even = arr[i] % 2;
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
			
		}
		System.out.println("Odd numbers in an array: ");
		for( i = 0; i<n ; i++) {
//			even = arr[i] % 2;
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
			
		}
		
		
		
		
		
		
		
		

	}

}
