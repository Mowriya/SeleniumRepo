package assignment;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1= 0;
		int n2= 1;
		int n3;
		int Count = 8;
		
		System.out.println(+n1 +"\n" +n2);
	
	  for (int i = 2; i < Count; i++)
	  {
		  
	n3= n1+n2;
	  n1=n2;
	  n2=n3;
	  
	  System.out.println(n3);
	 }
	}
}
