package handlingframesdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSiblingsFramesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		
		WebElement Leftbox = driver.findElement(By.xpath("//body"));
		System.out.println(Leftbox.getText());
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-middle");
		
		WebElement middlebox = driver.findElement(By.id("content"));
		System.out.println(middlebox.getText()); 
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-right");
		WebElement rightbox = driver.findElement(By.xpath("//body"));
		System.out.println(rightbox.getText());
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-bottom");
		WebElement bottombox = driver.findElement(By.xpath("//body"));
		System.out.println(bottombox.getText());
		
		
	}

}
