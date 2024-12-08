package javascriptexecutordemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
	/*	String pagettitle = driver.getTitle();
        System.out.println(pagettitle);
        driver.quit(); */
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		 String title = (String)jse.executeScript(" return document.title");
		 System.out.println(title);
		 driver.quit();
	}

}
