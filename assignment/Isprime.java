package assignment;

public class Isprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		int n= 31;
		int temp= 0;
		if (n==0 || n==1)
		{
			System.out.println("Num is not prime");
		}else {
			
		
		
			for(i=2;i<= n/2; i++)
				
			{
				
			
		
				if(n%i==0) {
					System.out.println("Num is not prime");
					temp = 1;
							break;
				}
					
				}if (temp ==0) {
					System.out.println(" num is prime");
				}
			
			}
			
		}
	}

