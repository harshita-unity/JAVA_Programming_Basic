package com.arrays;
import java.util.*;

public class SumOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		//storing number of elements we want to store in an array
		System.out.println("Enter the number of elements you want to store in array: ");
		int n = sc.nextInt();
		
		//creating a new array object
		
		int arr[] = new int[n];
		
		// input the numbers inside the array using for loop
		System.out.println("Array elements are as follows: ");
		for(int i = 0; i<n;i++) {
			arr[i] =sc.nextInt(); 
			}
		
		for(int i  = 0; i< n; i++) {
			System.out.println(arr[i]);
		
		}
		//sum of an array 
		
		for(int  i = 0; i<n;i++) {
			sum = sum+ arr[i];
			
		}
		System.out.println("Sum will be: " + sum);
		
		
		 
	}
	}


