package tagnamedemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllHyperlinkByTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement link : links)
		{
			link.getText();
			link.getAttribute("href");
			System.out.println(link.getText()+ ":"+link.getAttribute("href"));
		}
		driver.quit();

	}

}
