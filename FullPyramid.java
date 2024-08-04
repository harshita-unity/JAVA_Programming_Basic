package com.patternsdesign;
import java.util.*;

public class FullPyramid {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		//left hand right angle triangle
		for(int i = 1; i <n;i++) {
			for(int j = n-i;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
//			for(int l = 0; l<=i+1;l++) {
//				System.out.print("*");
//			}
			System.out.println();
			
		}
		
					

	}

}
