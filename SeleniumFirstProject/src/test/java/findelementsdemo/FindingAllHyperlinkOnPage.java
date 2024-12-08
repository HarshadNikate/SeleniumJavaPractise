package findelementsdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingAllHyperlinkOnPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		for(WebElement link : links)
		{
			String linkName=link.getText();
			 String linkUrl=link.getAttribute("href");
			 
			 System.out.println(linkName +":"+ linkUrl);
		}
		driver.quit();
		
	}

}
