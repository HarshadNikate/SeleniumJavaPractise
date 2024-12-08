import java.util.Scanner;

public class ToFindVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = sc.next().charAt(2);
		
		
		if (ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u')
		{
			System.out.println("Its a vowel");
		}
		else
			System.out.println("Its not a vowel");
	}

}
