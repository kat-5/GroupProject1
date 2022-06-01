package Class10;

import java.util.Scanner;

public class GroupProject1Ex2 {

	public static void main(String[] args) {
		
		
		/*2. Using Scanner create an array of countries. When an
		array is created, retrieve all values from it and while
		retrieving those values print capital for each country.
		(use 2 different loops).*/
		
		 Scanner scan =new Scanner(System.in);
        //finding the length of the Array studentNames
        System.out.print("how many students?:");
        int totalStudents = scan.nextInt();

        String[] studentNames = new String [totalStudents];

        //allows user to input student names

        for(int j = 0; j < studentNames.length;j++) 
        {
 
        System.out.print("enter student names:");
         studentNames[j] = scan.nextLine();  
        }

        for (String element:studentNames)
       { 
	 
        System.out.println(element);
 
 }
}
		

		
		
		/*
			  Scanner scan =new Scanner(System.in);
			  
			  System.out.println("Please enter an array of countries"); 
			  String countries = scan.next();
			  
			  */
			 
		 /*  String country[]={"Italy", "Egypt", "Mexico", "Iceland", "Japan"};
		    
		   String capital []={"Rome", "Cairo", "Mexico City", "Reykjavík", "Tokyo" };
		    
		   System.out.println("Please enter the number of countries you have visited ");
		   int size = scan.nextInt();
		   
		   int [] array = new int [size];
		   
		   for (int i = 0; i < size; i++) {
					System.out.println("Enter country.");
					String name=scan.next();
					
		    System.out.println("The capital of "+name+" is "+capital[i]+".");
		   
		   }
	
	*/
		
	}


