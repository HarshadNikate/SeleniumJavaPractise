package alertdemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlinginformationAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	   WebElement jsalertbtn= driver.findElement(By.xpath("//button[text()='Click for JS Alert']")); //we can use this xpath expression also :- //button)[1]
	   jsalertbtn.click();
	   
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.alertIsPresent());
	   
	   Alert alert= driver.switchTo().alert();
	   String text=alert.getText();
	   System.out.println(text);
	   
	  
	 //  alert.accept();
	   
	   alert.dismiss();
	   Thread.sleep(10000);
	  driver.switchTo().defaultContent();
	  WebElement result =driver.findElement(By.id("result"));
	  System.out.println(result.getText());
	   
	  driver.quit();
	    
	    

	}

}
