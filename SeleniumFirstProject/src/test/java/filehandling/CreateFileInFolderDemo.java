package filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFileInFolderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f1 = new File(System.getProperty("user.dir")+"\\Arun Mootori\\qa.txt");
		
		f1.createNewFile();
		
		File f2 = new File("Harry Nikate","qa1.txt");
		f2.createNewFile();
		System.out.println("End of the program");
		
		
	}

}
