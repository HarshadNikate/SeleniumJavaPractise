package filehandling;

import java.io.File;
import java.io.IOException;

public class CreatingFilesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//representing a file
		File qafoxfile = new File(System.getProperty("user.dir") + "\\qafox.txt");
		
		//create the above represented file
		qafoxfile.createNewFile();
		
		System.out.println("File has been created sucessfully");

	}

}
