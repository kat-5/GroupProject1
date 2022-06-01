package Class10;

public class GroupProject1Ex4 {

	public static void main(String[] args) {
		
		
		/*Create a 2D array of integer type where you will store
		odd and even numbers. Develop a program which will
		identify/print the even numbers only.*/
		
		
		
        int [][]  numbers= {
		
		{2,4,13,8,10,12},
		
		{3,5,7,9,11},
		
		{21,23,37},
		
		{37,39,45,83},
		
         };
	

        System.out.print("Even Numbers: "); 
	    for(int i=0;i<numbers.length; i++) {
	    	
	    	for(int b=0; b<numbers[i].length; b++) {
	    		
	           if(numbers[i][b]%2==0){  
	              System.out.print(numbers[i][b]+" ");  
	    
	           } 
	           
	        }  
	    	
	    
	     }
	    
     }
	
	
}
	


	