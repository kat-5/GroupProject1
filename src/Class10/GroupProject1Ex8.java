package Class10;

import java.util.Scanner;

public class GroupProject1Ex8 {
	
	public static void main(String[] args) {
		
		//Fibonacci series.
		
				int one =0;
				int two =1;
				
				Scanner in = new Scanner(System.in);
				System.out.println("how many elements you want to print in a Fibonacci series");
				int n=in.nextInt();
				
				System.out.println("Fibocacci series");
				System.out.print(one+" "+two+" ");
				
				int next;
				
				for (int i=2; i<n; i++) {
					next=one+two;
					
					System.out.print(next + " ");
					
					one = two;
					two = next;
   }
}
}

