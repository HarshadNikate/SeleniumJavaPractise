
public class SumOfEvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = 2;
		int sum= 0;
		
		
		/*for(int i=0;i<5;i++ )
		{
			
			//this is for odd
			sum = sum + (n*i +1);    
			
			//this is for even
			//sum= sum + n*i;
		}
	System.out.println(sum);  */
		
		int i=1;
		while( i<=5)
		{
			sum = sum + n*i;
			i++;
		}
		System.out.println(sum);
	}

	
	
}
