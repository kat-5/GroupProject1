package Class10;

public class GroupProject1Ex6 {

	public static void main(String[] args) {
		/*how to swap two numbers in java
		* without using temporary variable?
		 Step1: USING: arithmetic operator
		
		 * a = 10
		 * b = 30
		 * a = a-b = 10-30 = -20
		 * b = a+b = -20 + 30 = 10
		 * a = b-a = 10 -(-20)= 10 + 20 =30
		 * results:
		 * a = 30
		 * b =10
		 */
	
	int first = 10;
	int second = 30 ;
	System.out.println("Before Swap");
	System.out.println("first number before swap is: "+first);
	System.out.println("second number before swap is: "+second);
	
	// now lets apply the formula:
	
	first = first-second ;
	second = first+second ;
	first = second-first ;
	System.out.println("After Swap");
	System.out.println("first number afetr swap is: "+first);
	System.out.println("second number after swap is: "+second);
	
	// Swapping Two numbers in java using XOR ^
	int a = 10 ;
	int b = 20 ;
	        a=a^b  ;
			b=a^b ;
			a=a^b  ;
	
			System.out.println("a = "+a);
			System.out.println("b = "+b);
	
	
	}
	

}
