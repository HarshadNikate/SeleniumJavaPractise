package xpathdemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PipeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		List<WebElement> elements = driver.findElements(By.xpath("//textarea[@id='ta1']|//input[@class='gsc-input']")) ;
		
		for(WebElement e : elements)
		{
		    
		   String tagname = e.getTagName();
		   
		   if (tagname.equals("textarea"))
		   {
			   e.sendKeys("Harry Bhai");
			   
		   }
		   
		   else
		   {
			   e.sendKeys("Nikate Family");
		   }
		}
	}

}
