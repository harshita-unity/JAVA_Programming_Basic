package com.patternsdesign;

import java.util.Scanner;

public class ReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		for(int i = n; i >0; i--) {
			for(int j= n - i;j> 0;j--) {
				System.out.print(" ");
			}
			for(int k=i ;k>0;k--) {
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println();

	}

}
