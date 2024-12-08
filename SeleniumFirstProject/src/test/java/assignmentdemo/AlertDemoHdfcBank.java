package assignmentdemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemoHdfcBank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
		
		//driver.findElement(By.xpath("//a[text()='Forgot Customer ID']")).click();
		WebElement continuebtn=driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
		continuebtn.click();
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert=driver.switchTo().alert();
		String alertmsg =alert.getText();
		System.out.println(alertmsg);
		
		alert.accept();
		Thread.sleep(3000);
		
		
		
		

		
		
	}

}
