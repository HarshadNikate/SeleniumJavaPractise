
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* int n=4;
		int fact=1;
		for(int i=1; i<=n; i++)
		{
			fact = fact * i;
		}
		System.out.println(fact); */
		
		int n=5;
		int i= 1;
		int fact =1;
		
		while(i<=n)
		{
			fact*=i;
			i++;
		}
		System.out.println(fact);
	} 

}
 