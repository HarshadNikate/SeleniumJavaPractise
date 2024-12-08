package temp;

import java.util.Date;

public class Demo {

//below code in single line for timestamp
		
		public String sample()
		{
		return  "santu"+new Date().toString().replaceAll(" ","_").replaceAll(":","_")+"@gmail.com";
		}
		
		public static void main (String[] args)
		{
		    Demo d = new Demo();
		    d.sample();
		}
		
}	
		
		
/*		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toString());
		String datestring = date.toString();
		String spacereplaceunderscore = datestring.replaceAll(" ","_");
		System.out.println(spacereplaceunderscore);
		String timeStamp = spacereplaceunderscore.replaceAll(":","_");
		System.out.println(timeStamp);
		String finalEmailStamp = "santu"+timeStamp+"@gmail.com";
		System.out.println(finalEmailStamp);     
	 */
	

