package com.patternsdesign;
import java.util.*;

public class RectangleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j = 1; j<=5;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		

	}

}
