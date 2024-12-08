package practiseJavaProgram;

public class ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	StringBuffer sb = new StringBuffer("Hello world");
	//	StringBuffer reverse = sb.reverse();
    //  	System.out.println(reverse);
	

		
	//	StringBuilder sb = new StringBuilder("Hello World");
	//	StringBuilder reverse = sb.reverse();
	//	System.out.println(reverse);
      	
      	String original = "Hello, World!";
		String reverse = "";
	
      for(int i=original.length()-1;i>=0;i--)
      {
    	  reverse=reverse + original.charAt(i) ;
    	  
      }
      System.out.println(reverse);
	}

		
	}       

