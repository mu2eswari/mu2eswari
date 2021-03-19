package week1.Assignments;

public class SumOfDigits {

	public static void main(String[] args) {
		
		//This program is to find the sum of digits in a number
		
		int number = 103;
		
		//Variable to store the sum
		
		int sum = 0;

		//To retain the value of original number
		
		int duplicate=number;
		
		int remainder = 0;
		
		while(duplicate > 0)
		{
			remainder = duplicate % 10;
			
			sum = sum + remainder;
			
			duplicate = duplicate / 10;
			
		}
		
		System.out.println("The sum of number in the number "+number+" is "+sum);
	}

}
