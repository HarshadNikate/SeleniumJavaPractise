package waitingmechanismdemo;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WatingMechanismImpicitWaitDemo {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://omayo.blogspot.com/");
			driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
			driver.findElement(By.linkText("Flipkart")).click();
			
		}

	}
	


