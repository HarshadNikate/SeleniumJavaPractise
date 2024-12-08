package javascriptexecutordemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DisplayAlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("alert('Hello harry here')");
        
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        
        Alert popupalert = driver.switchTo().alert();
        Thread.sleep(3000);
        popupalert.accept();
        driver.quit();
        
        
        
        
	}

}
