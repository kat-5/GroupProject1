package Class10;

import java.util.Scanner;

public class GroupProject1Ex7 {
	public static void main(String[] args) {
	
	/*7. Write a java program to check whether a given
    number is prime or not?*/

	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter a number: ");
	int num =scan.nextInt();
	int counter = 0;
	int i = 2;
	
	while (i < num) {
		if(num % i == 0) {
			counter++;
			
		}
		i++;
	}
	if (counter == 0) {
		 System.out.println(num + " is a prime number.");
	}
	else {
		System.out.println(num+ " is not a prime number.");
	}
}

}



