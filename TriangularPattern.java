package com.patternsdesign;
import java.util.*;

public class TriangularPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows in pattern: ");
		int n = sc.nextInt();
		
for(int i = 1; i <=n; i++) {
	for(int j= n-i;j> 0;j--) {
		System.out.print(" ");
	}
	for(int k=1;k<=i;k++) {
		System.out.print(" *");
	}
	System.out.println();
}
System.out.println();

	}

}
