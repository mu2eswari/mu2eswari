package week1.Assignments;

public class Palindrome {

	public static void main(String[] args) {
		
		// This program is to check the palindrome string
		
		String input = "madaM";
		
		String reversed = "";
		
		char[] charArray = input.toCharArray();
		
		for (int i = charArray.length - 1; i >=0 ; i--)
		{
		
			reversed = reversed + charArray[i];
									
		}
		
		if(input.equalsIgnoreCase(reversed))
		{
			System.out.println("The input string "+input+" is a palindrome");
		}
		else
			System.out.println("The input string "+input+" is not a palindrome");
	}

}
