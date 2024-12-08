import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter the year to check it is leap year or not");
		
		Scanner sc = new Scanner(System.in);
		int leapyear= sc.nextInt();
		
		
		if (leapyear%4==0 && (leapyear%100!=0 || leapyear%400==0))
		{
			System.out.println("Its a leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
		
	}

}
