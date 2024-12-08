package seleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");
		
		driver.findElement(By.xpath("//textarea[normalize-space()='The cat was playing in the garden.']")).clear();
		WebElement textarea = driver.findElement(By.xpath("//textarea[normalize-space()='The cat was playing in the garden.']"));
        textarea.sendKeys("hello harry bhai here");

	}

}
