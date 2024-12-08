import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the no to check the factorial");
		Scanner sc = new Scanner(System.in);
		int factorialNo = sc.nextInt();
		
		int fact=1;
		
		for(int i =1;i<=factorialNo;i++)
		{
			fact=i*fact;
		}

	System.out.println(fact);
	}

}
