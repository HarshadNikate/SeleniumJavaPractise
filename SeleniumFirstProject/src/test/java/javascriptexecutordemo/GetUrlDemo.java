package javascriptexecutordemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
	/*	String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();  */
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
        String url = jse.executeScript("return document.URL").toString();
        System.out.println(url);
        driver.quit();
	}

}
