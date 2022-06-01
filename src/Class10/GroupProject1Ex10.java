package Class10;

public class GroupProject1Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int Largest = 0;
		int SecondLargest = 0;
		
		int[] numbers= {26, 16, 30, 5, 22};
	
		
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] > Largest) {
				SecondLargest=Largest;
				Largest=numbers[i];
			}else if (numbers[i]>SecondLargest) {
				SecondLargest=numbers[i];
			}
			
			
		}
		System.out.println("The Second largest number is "+SecondLargest);
	}

}
