package staleelementreferencedemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementResolvePractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='widget LinkList']//a"));
		
		int size=options.size();
		
		for(int i=1;i<=size;i++)
		{
			String linkxpath = "(//div[@class='widget LinkList']//a)["+i+"]";
			WebElement link = driver.findElement(By.xpath(linkxpath));
			link.click();
			driver.navigate().back();
			
		}
		driver.quit();
		
		
	}

}
