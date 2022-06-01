package Class10;

import java.util.Scanner;

public class GroupProject1Ex2 {

	public static void main(String[] args) {
		
		
		/*2. Using Scanner create an array of countries. When an
		array is created, retrieve all values from it and while
		retrieving those values print capital for each country.
		(use 2 different loops).*/
Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in array");
		int num = scan.nextInt();
		
		String[] countries = new String[num];
		System.out.println("Enter country ");
		
		String capital = "null";
		scan.nextLine();
		
		for (int i = 0; i < num; i++) {
			countries[i] = scan.nextLine();
			switch (countries[i]) {
			case "Italy":
				capital = "Rome";
				break;
			case "Egypt":
				capital = "Cairo";
				break;
			case "Mexico":
				capital = "Mexico City";
				break;
			case "Iceland":
				capital = "Reykjavík";
				break;
			case "Japan":
				capital = "Tokyo";
				break;
			default:
				capital = "Country not in database";
			}
			System.out.println(countries[i] + ":" + capital);
		}
	}
}


