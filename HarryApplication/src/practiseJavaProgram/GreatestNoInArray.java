package practiseJavaProgram;

public class GreatestNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {6,2,11,4,16,1};
		
		int greatest = arr[0];
		
		for(int num :arr) {
			if(num>greatest)
			{
				greatest=num;
			}
			
	}
		System.out.println("Greatest no is :- " +greatest );
	}

}
