package Class10;

public class GroupProject1Ex3 {

	public static void main(String[] args) {
		
		
		/*3. Create a 2D array of integer values. Print the sum of
		all numbers.*/
		
		
	int numbers [][] = {      
                {5, 38, 13},    
                {22, 8, 16},    
                {43, 26, 9} 		                        
             };
     int sum=0;
     for (int i=0;i<numbers.length;i+=1){
     for (int j=0;j<numbers[i].length;j++)		               	
	   sum=sum+numbers[i][j];             
}

     System.out.println("The sum of all numbers is "+sum);

	}

	}


