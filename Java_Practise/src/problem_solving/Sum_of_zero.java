package problem_solving;

public class Sum_of_zero {

	public static void main(String[] args) {
		
		int[] array = new int[]{ -1,0,1,2,-1,4 };
		
		int n=6;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(array[i]+array[j]+array[k] == 0)
					{
						System.out.print("{"+array[i]+","+array[j]+","+array[k]+"}");
					}
				}
			}
		}
		
		
	}
	
	
}
