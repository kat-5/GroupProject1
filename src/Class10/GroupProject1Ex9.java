package Class10;

import java.util.Arrays;

public class GroupProject1Ex9 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array
		
				// First way
				int[] num = { 10, 3, 78, 35, -6, 99, 19 };
				int max = 0;
				int min = 0;
				for (int i = 0; i < num.length; i++) {
					if (num[i] > max) {
						max = num[i];
					}
					if (num[i] < min) {
						min = num[i];
					}
				}
				System.out.println("The Maximum number in an array is = " + max);
				System.out.println("The Minimum number in an array is = " + min);
				System.out.println("---------");
				
				// Second Way
				Arrays.sort(num);
				System.out.println("The Maximum number in an array is = " + num[num.length - 1]);
				System.out.println("The Minimum number in an array is = " + num[0]);
			}
}
	


