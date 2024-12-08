package javascriptexecutordemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnteringTextIntoFieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		  WebElement textareafield = driver.findElement(By.id("ta1"));
		  WebElement searchAreaField = driver.findElement(By.name("q"));
		//textareafield.sendKeys("Harry here");   */
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='harry here'",textareafield, searchAreaField);
		
		
	}

}
