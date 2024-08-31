package com.minipoc;
import java.util.*;

public class NumberGuessingGame {

	public static void main(String[] args) {
		
		
			Scanner sc = new Scanner(System.in);
			Random random = new Random();
			int randomnumber = random.nextInt(100) + 1;
			
			int count = 0;
			int maxLimit = 5;
			while(count <= maxLimit) {
				System.out.println("Enter the number between 1 to 100: ");
				int user_input = sc.nextInt();
				if(user_input == randomnumber) {
					System.out.println("You guessed it right, Congratulations! ");
					break;
				}
				else if(user_input > randomnumber) {
					System.out.println("number is large, please try again");
				}
				else if(user_input < randomnumber) {
					System.out.println("number is small, please try again");
				}
				
				count ++;
			}
			
			if(count > maxLimit) {
				System.out.println("You have exhausted all your attempts, the correct number is " + randomnumber);
			}
			
		

	}

}
