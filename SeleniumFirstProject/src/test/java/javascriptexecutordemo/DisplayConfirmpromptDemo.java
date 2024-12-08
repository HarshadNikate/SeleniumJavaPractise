package javascriptexecutordemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayConfirmpromptDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	//	jse.executeScript("alert('Hello harry here ')");
		Thread.sleep(3000);
		//jse.executeScript("confirm('Do you agree with me')");
		jse.executeScript("prompt('Enter your age')");
		
	}

}
