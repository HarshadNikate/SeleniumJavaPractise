package practiseJavaProgram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no :");
		int factorial = sc.nextInt();
		
		int fact = 1;
		for(int i=1; i<=factorial ;i++)
		{
			
			fact= fact*i;
		}
		
		System.out.println(fact);
		
		
	}

}
