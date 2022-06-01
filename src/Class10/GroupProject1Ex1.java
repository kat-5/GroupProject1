package Class10;

import java.util.Scanner;

public class GroupProject1Ex1 {

	public static void main(String[] args) {
		
		/*1. Using Scanner create an array of integer values. After
           the array is created, calculate the sum of all stored
           elements in that array.*/
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the size of your number array.");
		int size = scan.nextInt();
		int[] array = new int[size];
			
		for (int i = 0; i < size; i++) {
			System.out.println("Enter your numbers.");
			array[i] = scan.nextInt();
		}
		scan.close();
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		System.out.println(sum + " is the sum of all elements.");
		
		
	}

}
