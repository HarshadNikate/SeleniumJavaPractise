package practiseJavaProgram;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no to check for prime no :");
		int num=sc.nextInt();
		
		boolean isPrime = true; 
		
		if(num<=1)
		{
			isPrime=false;
		}
		
		for(int i=2;i<num;i++)
		{
			if( num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		
		if(isPrime)
		{
			System.out.println("Its a prime no");
		}
		else
		{
			System.out.println("Its not a prime no");
		}
	
		
	}
}
