package assignment;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Finding Missing element of array");
		int a[] = {1,2,4,6,3};
		
		int n= a.length;
		int m = -1;
		Arrays.sort(a);
		for (int i=0;i<n;i++) {
			
			{
				if(a[i] !=i+1)
					
				{
					m = i+1;
					System.out.println(+m);
				}
					
			}
			
		}
	}
}



