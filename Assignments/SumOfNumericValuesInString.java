package week1.Assignments;

public class SumOfNumericValuesInString {

	public static void main(String[] args) {
		// This program is to find the sum of numeric values in a String
		
		String text = "Tes12Le79af65";
		
		int sum = 0;
		
		String values = text.replaceAll("[^0-9]", "");
		
		char[] charArray = values.toCharArray();
		
		System.out.println("String without alphabets "+values);
		
		for (int i = 0; i < charArray.length; i++) 
		{
		
			int numericValue = Character.getNumericValue(charArray[i]);
			sum = sum + numericValue;
						
		}
		
		System.out.println("Value of number in the string "+text+" is "+sum);
		
		System.out.println("Other Way");
		
		sum = 0;
		
		for (int i = 0; i < charArray.length; i++) 
		{
			boolean digit = Character.isDigit(charArray[i]);
			if(digit)
			{
				int numericValue = Character.getNumericValue(charArray[i]);
				sum = sum + numericValue;
			}
			Arrays
		}
		
		System.out.println("Value of number in the string "+text+" is "+sum);
		

	}

}
