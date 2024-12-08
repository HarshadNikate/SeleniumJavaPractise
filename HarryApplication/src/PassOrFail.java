import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter the 3 subjects marks to know you are pass or fail");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks for Maths");
		int m1 = sc.nextInt();
		System.out.println("Enter the marks for Physics");
		int m2 = sc.nextInt();
		System.out.println("Enter the marks for Chemistry");
		int m3 = sc.nextInt();
		
		float avg = (m1+m2+m3)/3.0f;
		if(avg>=40 && m1>=33 && m2>=33 && m3>=33)
		{
			System.out.println("Congo you are passed");
			
		}
		else
		{
			System.out.println("Sorry you are failed");
		}
		
	
	}

}
