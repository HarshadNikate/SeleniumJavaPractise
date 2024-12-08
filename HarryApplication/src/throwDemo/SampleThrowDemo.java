package throwDemo;

import java.util.Scanner;

public class SampleThrowDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("You are elible for voting");
		}
		else
		{
			throw new Exception("you are not eligible for voting");
		}
	}

}
