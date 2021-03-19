package week1.Assignments;

public class Factorial {

	public static void main(String[] args) {
		// This program is to find the factorial of a given number
		
		int number = 5;
		
		// Variable to store the factorial value
		
		int fact = 1;
		
		//iteration in decending order
		
		for (int i = number; i >=1; i--) 
		{
			
			fact = fact * i;
			
		}
		
		//iteration in ascending order
		/*
		for (int i = 1; i <=number; i++) 
		{
			
			fact = fact * i;
			
		}*/

		System.out.println("Factorial of number "+number+" is "+fact);
		
		
		
	
	}

}
