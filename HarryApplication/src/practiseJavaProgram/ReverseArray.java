package practiseJavaProgram;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	int [] a= {1,2,3,4,5,6};
	
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}  */
		
		
		int [] a= {1,2,3,4,5,6};
		
		 System.out.println("Original Array: " + Arrays.toString(a));
		
		int i =0;
		int j= a.length-1;int temp=0;
		
		while(i<j)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
	
		System.out.println("Reversed Array :-"+Arrays.toString(a));
		
		
	}

}
