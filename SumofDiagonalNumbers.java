package com.arrays;
import java.util.*;

public class SumofDiagonalNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number of rows: ");
		 int a = sc.nextInt();
		 System.out.println("Enter the rows of columns: ");
		 int b = sc.nextInt();
		 int sum1 = 0,sum2 = 0;
		 int diff = 0;
		 int[][] arr = new int[a][b];
		 System.out.println("Enter the elements below: ");
		 for(int i=0; i<a; i++ ) {
			 for(int j = 0;j<b;j++) {
				 arr[i][j] = sc.nextInt();
			 }
			 
		 }
		 for(int i =0;i<a;i++) {
			 for(int j=0; j<b;j++) {
				 System.out.print(arr[i][j] + " ");
			 }
			 System.out.println();
		 }
		 for(int i = 0;i<a;i++) {
			 for(int j = 0;j<b;j++) {
				 if(arr[i][j] == arr[0][1] || arr[i][j] == arr[1][1] || arr[i][j] == arr[2][2]) {
					  sum1 =+ arr[i][j];
				 }
				 else if(arr[i][j] == arr[0][2] || arr[i][j] == arr[1][1] || arr[i][j] == arr[2][0]) {
					  sum2 =+ arr[i][j];
				 }
				 
				  diff = sum2 - sum1;
				 
			 }
		 }
		 System.out.println("difference will be: " + diff);

	}

}
