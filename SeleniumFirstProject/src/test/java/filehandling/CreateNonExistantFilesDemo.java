package filehandling;

import java.io.File;
import java.io.IOException;

public class CreateNonExistantFilesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f1 = new File(System.getProperty("user.dir")+ "\\qafox.txt");
		 System.out.println(f1.exists()); 
		 
		 File f2 = new File(System.getProperty("user.dir")+"\\qafoxtraining.txt");
		 System.out.println((f2.exists()));
		 
		 if(!f1.exists())
		 {
			 f1.createNewFile();
		 }
		 else
		 {
			 System.out.println("File already exists. Hence not created");
		 }
		 
		 if(!f2.exists())
		 {
			 f2.createNewFile();
			 System.out.println("File not exists. Hence created.");
		 }
		 else
		 {
			 System.out.println("File already exists. Hence not created");
		 }
			 

	}

}
