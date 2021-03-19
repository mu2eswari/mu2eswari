package week1.Assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		

		// This program is to remove the duplicate words in a sentence
		String input = "We learn java basics as part of java sessions in java week1";
		
		String[] split = input.split(" ");
		
		String[] updated = input.split(" ");
		
		for(int i =0 ; i < split.length; i++)
		{
			int count = 0;
			
			for(int j = 0; j< split.length; j++)
			{
				if(split[i].equalsIgnoreCase(split[j]))
					count = count + 1;
				//System.out.println(count);
			}
			
			if(count>1)
			{
				updated[i]="";
			}
			
			System.out.print(updated[i]+" ");
		}
		
		
		
				
}
}
