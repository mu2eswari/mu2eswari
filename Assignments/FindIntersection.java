package week1.Assignments;

public class FindIntersection {

	public static void main(String[] args) {
		
		// This program is to find the intersection of two arrays
		
		int[] input1 = {1,2,3,4,5,6};
		
		int[] input2 = {1,3,5,7,9,8};
		
		for (int i=0;i<input1.length;i++)
		{
			for(int j=0;j<input2.length;j++)
			{
				if(input1[i] == input2[j])
				{
					input1[i]=input2[j];
					System.out.print(input1[i]+",");
					break;
				}
				
			}
			
			
		}
		

	}

}
