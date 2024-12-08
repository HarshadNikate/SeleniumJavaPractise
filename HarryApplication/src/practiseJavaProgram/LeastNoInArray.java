package practiseJavaProgram;

public class LeastNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         int [] arr = {6,2,11,4,16,9};
		
		int least = arr[0];
		
		for(int num :arr) {
			if(num<least)
			{
				least=num;
			}
			
	}
		System.out.println("least no is :- " +least );
	}

	}

