package week1.Assignments;

public class Fibonacci {

	public static void main(String[] args) {
		
		// This program is to generate the fibonacci series
		
		int range = 8;
		int number1 = 0, number2 = 1, sum = 0, temp =0;
		
		System.out.print(number1+","+number2+",");
		
		for(int i = 0; i < range-2; i++)
		{
			sum = number1+number2;
			temp = number2;
			number2 = sum;
			number1 = temp;
			System.out.print(sum+",");
		}

	}

}
