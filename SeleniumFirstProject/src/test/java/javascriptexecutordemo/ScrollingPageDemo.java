package javascriptexecutordemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPageDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");
		
		WebElement disablebtn = driver.findElement(By.id("isDisabled"));
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("arguments[0].scrollIntoView()",disablebtn);
		jse.executeScript("window.scrollTo(0,300)");
		disablebtn.click();
		Thread.sleep(3000);
		jse.executeScript("window.scrollTo(0,-200)");
	}
	

}
