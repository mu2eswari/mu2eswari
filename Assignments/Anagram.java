package week1.Assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// This program is to find the anagram words
		
		String input1 = "stops";
		
		String input2 = "potss";
		
		boolean status;
		
		char[] charArray = input1.toCharArray();
		
		char[] charArray2 = input2.toCharArray();
		
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		
		if(charArray.length == charArray2.length)
		{
			status = Arrays.equals(charArray, charArray2);
			if(status)
			{
				System.out.println(input1+" and "+input2+" are anagram");
			}
			else
				System.out.println(input1+" and "+input2+" are not anagram");
				
		}
		

	}

}
