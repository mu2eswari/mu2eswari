package week1.Assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// This program is to find the Armstrong number
		
		int number = 153;
		
		//To retain original value
		
		int duplicate = number;
		
		int armstrong = 0;
		
		int remainder;
		
		while(duplicate>0)
		{
			remainder = duplicate % 10;
			
			armstrong = armstrong + (remainder*remainder*remainder);
			
			duplicate =duplicate / 10;
			
		}

		if(armstrong ==  number)
		{
			System.out.println("The number "+number+" is an armstrong number");
		}
		else
			System.out.println("The number "+number+" is not an armstrong number");
	}

}
