package com.patternsdesign;
import java.util.*;

public class SquarePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int n = sc.nextInt();
		for(int i = 0; i<=n-1;i++) {
			for(int j = 0;j<=n-1;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
