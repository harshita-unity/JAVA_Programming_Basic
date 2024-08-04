package com.patternsdesign;
import java.util.*;

public class StarPattern_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <=i;j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
		for(int k = n-1;k>0;k--) {
			for(int j = k;j>0;j--) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
		
		
	}

}
