package week1.Assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// This is a program to reverse the string in the even place
		
		
		
		String test="I am a software tester";
		String[] t = test.split(" ");

		String val = "";
		for (int i = 0; i < t.length; i++) {

		    if (i % 2 == 1)
		        val = val + new StringBuilder(t[i]).reverse().toString() + " ";
		    else
		        val = val + t[i] + " ";
		}
		val = val.trim();
		System.out.println(val);
		
		
		
		//Other way
		String input = "I am a software tester";
		
		String[] split = input.split(" ");
		
		for (int i = 0; i < split.length; i++) 
		{
		
			int j=i+1;
			if(j % 2 == 0) 
			{
			
				char[] charArray = split[i].toCharArray();
				
				char[] str = new char[10];
				
				for (int k = 0,  l =charArray.length-1; k< charArray.length; k++,l--)
				{
					str[k] = charArray[l];
					//System.out.print(str[k]);
				}
				
				split[i]=new String(str);
				split[i]=split[i].trim();
				//System.out.println(split[i]);
			}
			
			System.out.print(split[i]+" ");
		}

}

}
