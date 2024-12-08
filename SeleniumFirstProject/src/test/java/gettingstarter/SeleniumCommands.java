package gettingstarter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://terimerishadi.com/login/");
		WebElement searchboxfield = driver.findElement(By.id("user_login"));
		searchboxfield.sendKeys("harshad");
		WebElement loginbutton = driver.findElement(By.xpath("//button[@name='submit']"));
		loginbutton.click();
		
		
	}

}
