package com.patternsdesign;
import java.util.*;

public class HollowRectangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int m = sc.nextInt();
        
        // Iterate over each row
        for(int i = 0; i < n; i++) {
            // For the first and last row, print full row of asterisks
            if(i == 0 || i == n - 1) {
                for(int j = 0; j < m; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            // For rows in between, print asterisks at the beginning and end, spaces in between
            else {
                for(int k = 0; k < m; k++) {
                    if(k == 0 || k == m - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
