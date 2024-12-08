package practiseJavaProgram;

import java.util.Scanner;

public class SwappingOfNoUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no for a variable :");
		int a=sc.nextInt();
		System.out.println("Enter a no for b variable :");
		int b=sc.nextInt();
	
	System.out.println("Before Swapping value of a:- "+a);
	System.out.println("Before Swapping value of b:- "+b);
	
    int temp=a;
    a=b;
    b=temp;
    
    System.out.println("After Swapping value of a :- "+a);
	System.out.println("After Swapping value of b :- "+b);
    
			
	}
	

}
