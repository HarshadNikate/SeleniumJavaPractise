package handlingframesdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotHandlingFramesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		
		WebElement firstname=driver.findElement(By.xpath("//input[@*='fname']"));
		firstname.sendKeys("Harry");
		
		

	}

}
