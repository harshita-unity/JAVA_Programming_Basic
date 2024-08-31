package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {

    // Method to sort an array - Bubble Sort
    static void sort_array(int arr[]) {
        int swap;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements in an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        sort_array(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int min_sum = 0;
        int max_sum = 0;

        // Calculate min_sum by summing the last n-1 elements
        for (int i = 1; i < n; i++) {
            min_sum += arr[i];
        }

        // Calculate max_sum by summing the first n-1 elements
        for (int j = 0; j < n - 1; j++) {
            max_sum += arr[j];
        }

        // Print the results
        System.out.println("Minimum sum (excluding the smallest element): " + min_sum);
        System.out.println("Maximum sum (excluding the largest element): " + max_sum);
    }
}
