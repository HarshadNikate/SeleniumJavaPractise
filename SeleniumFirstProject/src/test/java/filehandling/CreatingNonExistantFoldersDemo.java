package filehandling;

import java.io.File;

public class CreatingNonExistantFoldersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File folder1 = new File (System.getProperty("user.dir")+"\\Arun Mootori");
		System.out.println(folder1.exists()); 
		
		File folder2= new File(System.getProperty("user.dir")+"\\Harry Nikate");
		System.out.println(folder2.exists()); 
		
		if(!folder1.exists())
		{
			folder1.mkdir();
			System.out.println("Folder not exist. Hence  created");
		}
		else
		{
			System.out.println("Folder already exists. Hence not created");
		}
		
		if(!folder2.exists())
		{
			folder2.mkdir();
			System.out.println("Folder not exist. Hence  created");
		}
		else
		{
			System.out.println("Folder already exists. Hence not created");
		}
		
		
		
	}

}
