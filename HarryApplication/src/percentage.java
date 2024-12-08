import java.util.Scanner;

public class percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Hello enter the marks for subjects below");
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter marks for sub1");
		int a= sc.nextInt();
		
		System.out.println("Enter marks for sub2");
    	int b= sc.nextInt();
    	
		System.out.println("Enter marks for sub3");
		int c= sc.nextInt();
		
		System.out.println("Enter marks for sub4");
		int d= sc.nextInt();
		
		System.out.println("Enter marks for sub5");
        int e= sc.nextInt();
        
        double totalmarks =500;
        int sum = a+b+c+d+e;
        double percentage= (sum/totalmarks*100);
        System.out.println("Yor percentage is :" +percentage);
				
	}

}
