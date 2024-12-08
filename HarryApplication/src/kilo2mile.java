import java.util.Scanner;

public class kilo2mile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 0.621371;
		
		System.out.println("Program for conversion pf Km to miles");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the km :");
		double b = sc.nextDouble();
		
		double miles = b*a;
		System.out.println("Converted to miles :" +miles);
		

	}

}
