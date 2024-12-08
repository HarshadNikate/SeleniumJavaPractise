package assignmentdemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InformationAlertMobiscrollDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.mobiscroll.com/jquery/forms/alert-confirm-prompt#");
		
		WebElement showalertbtn=driver.findElement(By.id("show-alert"));
		showalertbtn.click();
		
		
		
	 driver.findElement(By.xpath("//button[text()='OK']")).click();
		
	
		
		driver.findElement(By.id("show-prompt")).click();
		 WebElement inputtext=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		 inputtext.sendKeys("harry");
		 driver.findElement(By.xpath("//button[text()='OK']")).click();
		
	 driver.quit();

	}

}
