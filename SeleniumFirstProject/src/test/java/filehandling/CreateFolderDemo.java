package filehandling;

import java.io.File;

public class CreateFolderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//representing the folder
		File folder1 = new File(System.getProperty("user.dir")+"\\Arun Mootori");
		
		folder1.mkdir();
		System.out.println("Folder has been created suceessfully");
		
	}

}
