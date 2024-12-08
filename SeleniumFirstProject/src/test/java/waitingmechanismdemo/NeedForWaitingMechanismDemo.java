package waitingmechanismdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeedForWaitingMechanismDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Flipkart")).click();
		
	}

}
