package seleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");
		WebElement textsearch= driver.findElement(By.name("q")); //finding element by name
		textsearch.sendKeys("Harry Bhai");
		WebElement button= driver.findElement(By.className("gsc-search-button"));//finding element by classname
		button.click();

	}

}
