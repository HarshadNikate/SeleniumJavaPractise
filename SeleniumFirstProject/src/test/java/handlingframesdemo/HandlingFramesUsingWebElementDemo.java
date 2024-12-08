package handlingframesdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesUsingWebElementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blogpendingtasks.blogspot.com/p/switchtoframeusingwebelement.html");
		
		WebElement home = driver.findElement(By.xpath("//iframe[@title='arunmotoori']"));
		driver.switchTo().frame(home);
		
		driver.findElement(By.linkText("Home")).click();
		
		

	}

}
